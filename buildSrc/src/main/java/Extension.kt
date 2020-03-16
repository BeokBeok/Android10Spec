import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope


fun DependencyHandlerScope.gradleProject() {
    "implementation"(ProjectGradle.gradle)
    "implementation"(ProjectGradle.kotlinGradlePlugin)
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

val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
            ?: error("Project $name is not an Android module")