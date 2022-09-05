import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "net.proxyrouter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}