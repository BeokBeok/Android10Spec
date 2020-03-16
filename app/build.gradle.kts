plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

androidApplicationConfig("com.example.android10spec")

dependencies {
    BasicDep.run {
        implementation(kotlin)
        implementation(fileTree(fileTreeMap))
    }

    UiDep.run {
        implementation(material)
        implementation(constraintLayout)
    }

    testImplementation(TestDep.junit)

    AndroidTestDep.run {
        androidTestImplementation(junitExt)
        androidTestImplementation(espressoCore)
    }
}