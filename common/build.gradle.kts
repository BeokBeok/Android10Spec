import dependency.LifeCycleComponent
import dependency.UiComponent
import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()

dependencies {
    implementation(UiComponent.MATERIAL)
    implementation(LifeCycleComponent.LIFECYCLE_EXT)

    testComponent()
    daggerComponent()
}