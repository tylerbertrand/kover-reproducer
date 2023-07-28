plugins {
    id("com.gradle.enterprise") version("3.14")
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.11.1"
}

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"
    buildScan {
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
    }
}

rootProject.name = "kover-reproducer"
include("libOne")
include ("otherLibs:subLib")
include ("libTwo")