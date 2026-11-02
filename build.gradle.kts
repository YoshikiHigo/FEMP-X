plugins {
    id("java")
}

group = "org.example"
version = "1.0.3"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

val isolatedTestClasses = fileTree("src/test/java") {
    include("**/ClonePair*DifferenceFindingTest.java")
}.files.mapNotNull { testSource ->
    val isolationMarker = Regex(
        """@Tag\(\s*"timeout"\s*\)|@BehavioralDifference\(\s*DifferenceType\.NO_TERMINATION\s*\)"""
    )
    if (isolationMarker.containsMatchIn(testSource.readText())) {
        testSource.relativeTo(file("src/test/java")).invariantSeparatorsPath
            .removeSuffix(".java").replace('/', '.')
    } else {
        null
    }
}.sorted()

tasks.withType<Test>().configureEach {
    // Stored witness assertions use LF, including output produced by println.
    systemProperty("line.separator", "\n")
}

tasks.test {
    useJUnitPlatform {
        excludeTags("timeout")
    }
    filter {
        isolatedTestClasses.forEach { excludeTestsMatching(it) }
    }
}

val timeoutTest by tasks.registering(Test::class) {
    description = "Runs timeout-sensitive tests in isolated JVMs."
    group = "verification"

    testClassesDirs = sourceSets.test.get().output.classesDirs
    classpath = sourceSets.test.get().runtimeClasspath

    useJUnitPlatform()
    filter {
        isolatedTestClasses.forEach { includeTestsMatching(it) }
    }
    onlyIf { isolatedTestClasses.isNotEmpty() }

    forkEvery = 1
    maxParallelForks = 1
    shouldRunAfter(tasks.test)
}

tasks.check {
    dependsOn(timeoutTest)
}
