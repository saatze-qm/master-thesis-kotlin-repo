plugins {
    kotlin("multiplatform")
}

repositories {
    mavenLocal()
    maven("../repo")
    mavenCentral()
}

kotlin {
    jvm()
    linuxX64 {
        binaries.staticLib {
            export("com.example:lib:1.0")
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("com.example:lib:1.0")
            }
        }
    }
}
