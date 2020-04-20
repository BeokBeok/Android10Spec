import dependency.UiComponent
import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()

dependencies {
    api(UiComponent.MATERIAL)

    testComponent()
    daggerComponent()
}