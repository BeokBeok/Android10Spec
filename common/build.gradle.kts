import dependency.UiComponent
import dependency.test

plugins {
    id("com.android.library")
    androidDefault()
}

androidLibraryConfig()

dependencies {
    implementation(UiComponent.MATERIAL)

    test()
}