plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish") version "0.25.3" apply false
}

/**
 * This is a workaround for https://github.com/JetBrains/compose-multiplatform/issues/3428
 */
subprojects {
    configurations.all {
        resolutionStrategy {
            force("org.jetbrains.kotlinx:atomicfu:0.21.0")
        }
    }
}