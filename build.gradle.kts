plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")
    id("org.jlleitschuh.gradle.ktlint")
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

    apply(plugin = "org.jlleitschuh.gradle.ktlint") // Version should be inherited from parent

    // Optionally configure plugin
    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        version.set("1.0.1")
    }
}