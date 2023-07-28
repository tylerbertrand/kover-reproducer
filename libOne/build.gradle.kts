plugins {
    id("org.jetbrains.kotlin.jvm")
    `java-library`
    id("org.jetbrains.kotlinx.kover")
}

repositories {
    mavenCentral()
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.8.20")
        }
    }
}