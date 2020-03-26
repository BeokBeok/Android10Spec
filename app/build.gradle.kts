plugins {
    id("com.android.application")
    androidDefault()
}

androidApplicationConfig("com.example.android10spec")

dependencies {
    BasicComponent.run {
        implementation(kotlin)
        implementation(fileTree(fileTreeMap))
    }

    UiComponent.run {
        implementation(material)
        implementation(constraintLayout)
    }

    testDep()
}