rootProject.name = "mc-plugin"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.voxelations.com/public")
    }
}

include("api")
include("paper")
