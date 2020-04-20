package dependency

object Version {
    const val KOTLIN = "1.3.70"
}

object AndroidSettings {
    const val COMPILE_SDK = 29

    const val MIN_SDK = 29
    const val TARGET_SDK = 29
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"

    const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object BasicComponent {
    val fileTreeMap = mapOf("dir" to "libs", "include" to listOf("*.jar"))
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.KOTLIN}"
}

object UiComponent {
    const val MATERIAL = "com.google.android.material:material:1.1.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"
}

object TestComponent {
    const val JUNIT = "junit:junit:4.12"
}

object AndroidTestComponent {
    const val JUNIT_EXT = "androidx.test.ext:junit:1.1.1"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.2.0"
}

object GradleComponent {
    const val GRADLE = "com.android.tools.build:gradle:3.6.2"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
}

object LifeCycleComponent {
    const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:2.2.0"
}

object DaggerComponent {
    private const val DAGGER_VER = "2.27"

    const val DAGGER = "com.google.dagger:dagger:$DAGGER_VER"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$DAGGER_VER"
}