plugins {
    id("com.gradle.enterprise") version("3.14")
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.11.1"
}

gradleEnterprise {
    server = "https://ge-helm-standalone-unstable.grdev.net"
    buildScan {
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
    }
}

rootProject.name = "kover-reproducer"
include("lib")