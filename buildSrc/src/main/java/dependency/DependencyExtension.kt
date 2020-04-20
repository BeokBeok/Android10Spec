package dependency

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.buildSrcDefault() {
    GradleComponent.run {
        implementation(GRADLE)
        implementation(KOTLIN_GRADLE_PLUGIN)
    }
    implementation(BasicComponent.KOTLIN)
}

fun DependencyHandlerScope.testComponent() {
    testApi(TestComponent.JUNIT)
    AndroidTestComponent.run {
        androidTestApi(JUNIT_EXT)
        androidTestApi(ESPRESSO_CORE)
    }
}

fun DependencyHandlerScope.daggerComponent() {
    DaggerComponent.run {
        api(DAGGER)
        kapt(DAGGER_COMPILER)
    }
}

private fun DependencyHandler.implementation(depName: String) =
    add("implementation", depName)

private fun DependencyHandler.api(depName: String) =
    add("api", depName)

private fun DependencyHandler.kapt(depName: String) =
    add("kapt", depName)

private fun DependencyHandler.testApi(depName: String) =
    add("testApi", depName)

private fun DependencyHandler.androidTestApi(depName: String) =
    add("androidTestApi", depName)
