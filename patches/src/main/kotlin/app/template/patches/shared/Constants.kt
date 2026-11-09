package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_TOR_BROWSER = Compatibility(
        name = "Tor Browser",
        packageName = "org.torproject.torbrowser",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x4A2E7E,
        targets = listOf(AppTarget(version = "16.0 (153.6.0esr)"))
    )
}