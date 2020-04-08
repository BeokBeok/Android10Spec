import dependency.BasicComponent
import dependency.UiComponent
import dependency.dagger
import dependency.test

plugins {
    id("com.android.application")
    androidDefault()
}

androidApplicationConfig("com.example.android10spec")

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