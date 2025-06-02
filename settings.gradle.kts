pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal() // Add this
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { url = uri("https://jitpack.io") }
    }
}
include(":app")
