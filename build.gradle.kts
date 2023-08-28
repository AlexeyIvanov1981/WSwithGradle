plugins {
    id("java")
}



repositories {
    mavenCentral()
}

java {
    toolchain{
        languageVersion = JavaLanguageVersion.of(11)
    }
}

dependencies {
    //Selenide
    testImplementation("com.codeborne:selenide:5.25.1")
    testRuntimeOnly("org.slf4j:slf4j-simple:1.7.32")

    //JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}