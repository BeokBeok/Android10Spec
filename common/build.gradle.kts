import dependency.*

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()

dependencies {
    BasicComponent.run {
        api(KOTLIN)
        api(fileTree(fileTreeMap))
    }

    UiComponent.run {
        api(MATERIAL)
        api(CONSTRAINT_LAYOUT)
    }

    api(LifeCycleComponent.LIFECYCLE_EXT)

    testComponent()
    daggerComponent()
}