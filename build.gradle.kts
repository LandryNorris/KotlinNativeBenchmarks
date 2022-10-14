plugins {
    kotlin("multiplatform") version "1.7.20"
    id("org.jetbrains.kotlinx.benchmark") version "0.4.4"
}

group = "me.landrynorris"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

benchmark {
    targets {
        register("macosArm64")
        register("macosX64")
    }

    configurations {
        val main by getting {
            iterations = 10
            iterationTime = 1000
            iterationTimeUnit = "ms"

            outputTimeUnit = "s"

            reportFormat = "text"
        }
    }
}

kotlin {
    val nativeTargets = listOf(macosArm64(), macosX64())

    nativeTargets.forEach {
        val main by it.compilations.getting
        val fibonacci by main.cinterops.creating
        val constant by main.cinterops.creating
    }

    sourceSets {
        val nativeMain by creating {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.4")
            }
        }
        val nativeTest by creating

        val macosArm64Main by getting { dependsOn(nativeMain) }
        val macosX64Main by getting { dependsOn(nativeMain) }
    }
}
