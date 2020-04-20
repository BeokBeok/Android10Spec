import dependency.BasicComponent
import dependency.UiComponent
import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.application")
    id("scabbard.gradle") version "0.2.0"
    defaultPlugins()
}

androidApplicationConfig("com.example.android10spec")
android {
    scabbard {
        enabled = true
    }
}

dependencies {
    implementation(project(":common"))

    BasicComponent.run {
        implementation(KOTLIN)
        implementation(fileTree(fileTreeMap))
    }

    UiComponent.run {
        implementation(MATERIAL)
        implementation(CONSTRAINT_LAYOUT)
    }

    testComponent()
    daggerComponent()
}