import dependency.testDep

plugins {
    id("com.android.library")
    androidDefault()
}

androidLibraryConfig()

dependencies {
    testDep()
}