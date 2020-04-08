import dependency.BasicComponent
import dependency.UiComponent
import dependency.dagger
import dependency.test

plugins {
    id("com.android.application")
    androidDefault()
    id("scabbard.gradle") version "0.2.0"
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

    test()
    dagger()
}