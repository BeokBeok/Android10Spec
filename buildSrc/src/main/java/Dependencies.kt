object Version {
    const val kotlin = "1.3.70"
}

object AndroidSettings {
    const val compileSdk = 29

    const val minSdk = 29
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object BasicDep {
    val fileTreeMap = mapOf("dir" to "libs", "include" to listOf("*.jar"))
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
}

object UiDep {
    private const val materialVer = "1.1.0"
    private const val constraintLayoutVer = "1.1.3"

    const val material = "com.google.android.material:material:$materialVer"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVer"
}

object TestDep {
    private const val junitVer = "4.12"

    const val junit = "junit:junit:$junitVer"
}

object AndroidTestDep {
    private const val junitExtVer = "1.1.1"
    private const val espressoVer = "3.2.0"

    const val junitExt = "androidx.test.ext:junit:$junitExtVer"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVer"
}

object ProjectGradle {
    private const val gradleVer = "4.0.0-beta01"

    const val gradle = "com.android.tools.build:gradle:$gradleVer"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
}