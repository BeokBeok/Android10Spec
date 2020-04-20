import dependency.BasicComponent
import dependency.UiComponent

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

    implementation(UiComponent.CONSTRAINT_LAYOUT)
}