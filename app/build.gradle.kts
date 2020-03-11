plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(AndroidSettings.compileSdk)
    defaultConfig {
        applicationId = "com.example.android10spec"
        minSdkVersion(AndroidSettings.minSdk)
        targetSdkVersion(AndroidSettings.targetSdk)
        versionCode = AndroidSettings.versionCode
        versionName = AndroidSettings.versionName

        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner
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

    buildFeatures {
        dataBinding
    }
}

dependencies {
    implementation(fileTree(BasicDep.fileTreeMap))
    implementation(BasicDep.kotlin)

    UiDep.run {
        implementation(material)
        implementation(constraintLayout)
    }

    testImplementation(TestDep.junit)

    AndroidTestDep.run {
        androidTestImplementation(junitExt)
        androidTestImplementation(espressoCore)
    }
}

