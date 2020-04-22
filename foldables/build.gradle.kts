import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()

dependencies {
    implementation(project(":common"))

    testComponent()
    daggerComponent()
}