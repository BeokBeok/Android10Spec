plugins {
    id("com.android.library")
    id("kotlin-android")
}

androidLibraryConfig()

dependencies {
    testImplementation(TestDep.junit)

    AndroidTestDep.run {
        androidTestImplementation(junitExt)
        androidTestImplementation(espressoCore)
    }
}