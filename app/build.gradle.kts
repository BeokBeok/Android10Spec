import dependency.testDep

plugins {
    id("com.android.application")
    androidDefault()
}

androidApplicationConfig("com.example.android10spec")

dependencies {
    dependency.BasicComponent.run {
        implementation(KOTLIN)
        implementation(fileTree(fileTreeMap))
    }

    dependency.UiComponent.run {
        implementation(MATERIAL)
        implementation(CONSTRAINT_LAYOUT)
    }

    testDep()
}