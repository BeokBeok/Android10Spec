import dependency.*

plugins {
    id("com.android.library")
    defaultPlugins()
}

androidLibraryConfig()

dependencies {
    implementation(project(":common"))

    BasicComponent.run {
        implementation(KOTLIN)
        implementation(fileTree(fileTreeMap))
    }

    UiComponent.run {
        implementation(MATERIAL)
        implementation(CONSTRAINT_LAYOUT)
    }

    implementation(LifeCycleComponent.LIFECYCLE_EXT)

    testComponent()
    daggerComponent()
}