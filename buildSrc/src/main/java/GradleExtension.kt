import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import dependency.AndroidSettings
import org.gradle.api.Project
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
        ?: error("Project $name is not an Android module")

fun PluginDependenciesSpec.defaultPlugins() {
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("scabbard.gradle") version "0.2.0"
}

fun Project.androidApplicationConfig(appId: String) {
    androidLibraryConfig {
        applicationId = appId
        versionCode = AndroidSettings.VERSION_CODE
        versionName = AndroidSettings.VERSION_NAME
    }
}

fun Project.androidLibraryConfig(defaultConfigExtensions: (DefaultConfig.() -> Unit)? = null) {
    android.run {
        AndroidSettings.let {
            compileSdkVersion(AndroidSettings.COMPILE_SDK)
            defaultConfig {
                defaultConfigExtensions?.invoke(this)
                minSdkVersion(AndroidSettings.MIN_SDK)
                targetSdkVersion(AndroidSettings.TARGET_SDK)
                testInstrumentationRunner = AndroidSettings.TEST_RUNNER
            }
        }
        buildTypes {
            getByName("debug") { isMinifyEnabled = false }
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
                consumerProguardFiles("consumer-rules.pro")
            }
        }
        dataBinding {
            isEnabled = true
        }
    }
}