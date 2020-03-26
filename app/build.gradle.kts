plugins {
    id("com.android.application")
    androidDefault()
}

androidApplicationConfig("com.example.android10spec")

dependencies {
    BasicComponent.run {
        implementation(KOTLIN)
        implementation(fileTree(fileTreeMap))
    }

    UiComponent.run {
        implementation(MATERIAL)
        implementation(CONSTRAINT_LAYOUT)
    }

    testDep()
}