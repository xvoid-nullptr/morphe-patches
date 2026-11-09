package app.template.patches.torbrowser

import app.morphe.patcher.extensions.InstructionExtensions.instructions
import app.morphe.patcher.extensions.InstructionExtensions.removeInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_TOR_BROWSER
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

@Suppress("unused")
val removeTorToastPatch = bytecodePatch(
    name = "Remove 'Connected to Tor' Toast",
    description = "Удаляет появляющийся после успешного соединения к Tor Toast"
) {
    compatibleWith(COMPATIBILITY_TOR_BROWSER)

    execute {
        val targetMethod = OnBootstrapStageChangeFingerprint.method

        val startIndex = targetMethod.instructions.indexOfFirst { instruction ->
            if (instruction.opcode != Opcode.SGET) return@indexOfFirst false
            val ref = (instruction as? ReferenceInstruction)?.reference as? FieldReference
            ref?.name == "connection_assist_bootstrap_succeeded_toast_message" &&
                ref.definingClass == "Lorg/mozilla/fenix/R\$string;"
        }

        if (startIndex == -1) return@execute

        val endIndex = targetMethod.instructions.drop(startIndex).indexOfFirst {
            it.opcode == Opcode.RETURN_VOID
        }.let { if (it == -1) -1 else startIndex + it }

        if (endIndex != -1 && endIndex > startIndex) {
            targetMethod.removeInstructions(startIndex, endIndex - startIndex)
        }
    }
}