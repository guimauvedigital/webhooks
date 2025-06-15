plugins {
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.maven) apply false
}

allprojects {
    group = "digital.guimauve.webhooks"
    version = "1.0.1"

    repositories {
        mavenCentral()
    }
}
