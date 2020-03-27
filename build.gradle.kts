// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        dependency.GradleComponent.run {
            classpath(GRADLE)
            classpath(KOTLIN_GRADLE_PLUGIN)
        }
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
