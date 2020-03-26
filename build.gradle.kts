// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        GradleComponent.run {
            classpath(gradle)
            classpath(kotlinGradlePlugin)
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
