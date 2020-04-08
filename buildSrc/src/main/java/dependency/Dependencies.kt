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
    private const val MATERIAL_VER = "1.1.0"
    private const val CONSTRAINT_LAYOUT_VER = "1.1.3"

    const val MATERIAL = "com.google.android.material:material:$MATERIAL_VER"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VER"
}

object TestComponent {
    private const val JUNIT_VER = "4.12"

    const val JUNIT = "junit:junit:$JUNIT_VER"
}

object AndroidTestComponent {
    private const val JUNIT_EXT_VER = "1.1.1"
    private const val ESPRESSO_VER = "3.2.0"

    const val JUNIT_EXT = "androidx.test.ext:junit:$JUNIT_EXT_VER"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_VER"
}

object GradleComponent {
    private const val GRADLE_VER = "3.6.2"

    const val GRADLE = "com.android.tools.build:gradle:$GRADLE_VER"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
}

object LifeCycleComponent {
    private const val LIFECYCLE_VER = "2.2.0"

    const val LIFECYCLE_VM = "androidx.lifecycle:lifecycle-viewmodel:$LIFECYCLE_VER"
    const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VER"
}

object DaggerComponent {
    private const val DAGGER_VER = "2.27"

    const val DAGGER = "com.google.dagger:dagger:$DAGGER_VER"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$DAGGER_VER"
}