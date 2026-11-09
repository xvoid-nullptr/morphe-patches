package app.template.patches.torbrowser

import app.morphe.patcher.Fingerprint

internal object OnBootstrapStageChangeFingerprint : Fingerprint(
    definingClass = "Lorg/mozilla/fenix/tor/TorControllerGV;",
    name = "onBootstrapStageChange",
    parameters = listOf("Lorg/mozilla/geckoview/TorConnectStage;"),
    returnType = "V"
)
