plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20" apply false
    id("org.jetbrains.kotlinx.kover") version "0.7.1"
}

repositories {
    mavenCentral()
}

dependencies {
    kover(project(":libOne"))
    kover(project(":otherLibs:subLib"))
    kover(project(":libTwo"))
}

apply(from = "gradle/someplugin.gradle.kts")

subprojects {
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        inputs.files(layout.buildDirectory.file("tmp/test/kover-agent.args"))
        distribution {
            enabled = true
            maxLocalExecutors = 0
            maxRemoteExecutors = 2
        }
    }
}
