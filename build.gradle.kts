import com.jfrog.bintray.gradle.BintrayExtension
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("kotlin2js") version "1.4.32"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

repositories {
    maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + listOf("-Xallow-kotlin-package")
    }
}

group = "org.jetbrains.kotlinx"
val artifactId = "kotlinx-browser"
version = "0.2"

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(project.the<SourceSetContainer>()["main"].allSource)
}

tasks.jar {
    from("${project(":empty").buildDir}/classes/kotlin/main/")
    dependsOn(":empty:classes")
}

publishing {
    publications.invoke {
        register("maven", MavenPublication::class) {
            artifactId = artifactId
            artifact(tasks.jar.get())
            artifact(sourcesJar.get())
        }
    }
}

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_API_KEY")
    publish = true
    setPublications("maven")
    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "kotlinx"
        name = "kotlinx.browser"
        userOrg = "kotlin"
        setLicenses("Apache-2.0")
        githubRepo = "Kotlin/kotlinx-browser"
        websiteUrl = "https://github.com/Kotlin/kotlinx-browser"
        issueTrackerUrl = "https://github.com/Kotlin/kotlinx-browser/issues"
        vcsUrl = "https://github.com/Kotlin/kotlinx-browser.git"
        description = "Kotlin browser API"
        setLabels("kotlin", "browser", "kotlinx", "document-object-model")
        desc = description
    })
}
