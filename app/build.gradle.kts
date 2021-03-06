import dependency.daggerComponent
import dependency.testComponent

plugins {
    id("com.android.application")
    defaultPlugins()
}

androidApplicationConfig("com.example.android10spec")
android {
    scabbard {
        enabled = true
    }
}

dependencies {
    implementation(project(":common"))
    implementation(project(":foldables"))
    implementation(project(":5gnetworks"))
    implementation(project(":smartReplyInNotifications"))
    implementation(project(":darkTheme"))
    implementation(project(":gestureNavigation"))
    implementation(project(":settingsPanels"))
    implementation(project(":sharingShortcuts"))

    testComponent()
    daggerComponent()
}