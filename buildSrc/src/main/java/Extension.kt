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
        versionCode = AndroidSettings.VERSION_CODE
        versionName = AndroidSettings.VERSION_NAME
    }
}

fun Project.androidLibraryConfig(defaultConfigExtensions: (DefaultConfig.() -> Unit)? = null) {
    android.run {
        AndroidSettings.let {
            compileSdkVersion(it.COMPILE_SDK)
            defaultConfig {
                defaultConfigExtensions?.invoke(this)
                minSdkVersion(it.MIN_SDK)
                targetSdkVersion(it.TARGET_SDK)
                testInstrumentationRunner = it.TEST_RUNNER
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
    testImplementation(TestComponent.JUNIT)
    AndroidTestComponent.run {
        androidTestImplementation(JUNIT_EXT)
        androidTestImplementation(ESPRESSO_CORE)
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
