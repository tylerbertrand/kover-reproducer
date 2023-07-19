plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20"
    `java-library`
    id("org.jetbrains.kotlinx.kover") version "0.7.2"
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

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    distribution {
        enabled = true
        maxLocalExecutors = 0
        maxRemoteExecutors = 2
    }
}