import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()
android {
    scabbard {
        enabled = true
    }
}

dependencies {
    implementation(project(":common"))

    testComponent()
    daggerComponent()
}