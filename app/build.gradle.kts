plugins {
    id("common-android")
}

android {
    defaultConfig {
        applicationId = "com.example.android10spec"
        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner
    }
}

dependencies {
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

