plugins {
    id("java")
    id("maven-publish")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.apache.maven.plugins:maven-project-info-reports-plugin:2.9")
    implementation("com.google.code.findbugs:annotations:3.0.1")

    testImplementation("junit:junit:4.13")
}

group = "org.gedcom4j"
version = "4.0.2-SNAPSHOT"
description = "gedcom4j"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
