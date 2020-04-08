import dependency.UiComponent
import dependency.testDep

plugins {
    id("com.android.library")
    androidDefault()
}

androidLibraryConfig()

dependencies {
    implementation(UiComponent.MATERIAL)

    testDep()
}