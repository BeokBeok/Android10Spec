repositories {
    jcenter()
    google()
}

plugins {
    `kotlin-dsl`
}

// Dependencies.kt 에 접근 불가
// TODO-ryan (20-03-17): Gradle 라이브러리 버전 변경 시 이 부분도 같이 변경
dependencies {
    implementation("com.android.tools.build:gradle:3.6.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70")
}