plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform {
        excludeTags("timeout")
    }
}

val timeoutTest by tasks.registering(Test::class) {
    description = "Runs timeout-sensitive tests in isolated JVMs."
    group = "verification"

    testClassesDirs = sourceSets.test.get().output.classesDirs
    classpath = sourceSets.test.get().runtimeClasspath

    useJUnitPlatform {
        includeTags("timeout")
    }

    forkEvery = 1
    maxParallelForks = 1
    shouldRunAfter(tasks.test)
}

tasks.check {
    dependsOn(timeoutTest)
}
