import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.plugin.use.PluginDependenciesSpec

val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
        ?: error("Project $name is not an Android module")

fun PluginDependenciesSpec.androidDefault() {
    id("kotlin-android")
    id("kotlin-android-extensions")
}

fun Project.androidApplicationConfig(appId: String) {
    androidLibraryConfig {
        applicationId = appId
        versionCode = AndroidSettings.versionCode
        versionName = AndroidSettings.versionName
    }
}

fun Project.androidLibraryConfig(defaultConfigExtensions: (DefaultConfig.() -> Unit)? = null) {
    android.run {
        AndroidSettings.let {
            compileSdkVersion(it.compileSdk)
            defaultConfig {
                defaultConfigExtensions?.invoke(this)
                minSdkVersion(it.minSdk)
                targetSdkVersion(it.targetSdk)
                testInstrumentationRunner = it.testInstrumentationRunner
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
    }
}

fun DependencyHandlerScope.testDep() {
    testImplementation(TestDep.junit)
    AndroidTestDep.run {
        androidTestImplementation(junitExt)
        androidTestImplementation(espressoCore)
    }
}

private fun DependencyHandler.implementation(depName: String) =
    add("implementation", depName)

private fun DependencyHandler.kapt(depName: String) =
    add("kapt", depName)

private fun DependencyHandler.testImplementation(depName: String) =
    add("testImplementation", depName)

private fun DependencyHandler.androidTestImplementation(depName: String) =
    add("androidTestImplementation", depName)
