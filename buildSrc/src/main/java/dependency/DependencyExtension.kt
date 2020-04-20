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
    testImplementation(TestComponent.JUNIT)
    AndroidTestComponent.run {
        androidTestImplementation(JUNIT_EXT)
        androidTestImplementation(ESPRESSO_CORE)
    }
}

fun DependencyHandlerScope.daggerComponent() {
    DaggerComponent.run {
        implementation(DAGGER)
        kapt(DAGGER_COMPILER)
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
