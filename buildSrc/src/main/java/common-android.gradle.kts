plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AndroidSettings.compileSdk)
    defaultConfig {
        minSdkVersion(AndroidSettings.minSdk)
        targetSdkVersion(AndroidSettings.targetSdk)
        versionCode = AndroidSettings.versionCode
        versionName = AndroidSettings.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(fileTree(BasicDep.fileTreeMap))
    implementation(BasicDep.kotlin)
}