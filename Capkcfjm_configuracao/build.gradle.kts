plugins {
    // Using "Banrisul mobile framework" plugin to leverage its capabilities
    id("bergs.pwx.gradle.testes.mobile")

    // Using "application" plugin to make it possible to run the "main" project piece
    id("application")
}

subprojects {
	// Applying the "Banrisul mobile framework" on subprojects also
  apply(plugin = "bergs.pwx.gradle.testes.mobile")
	
  dependencies {
		// Using Rest Assured for REST API test automations
    implementation("io.rest-assured:rest-assured:5.3.0")

    // Using JSON Path for extra API JSON response handling
    implementation("io.rest-assured:json-path:5.3.0")
	}

  application {
    // Setting up the application entry point
    mainClassName = "app.WebServer"
  }

  tasks.withType(Test) {
      // Ensuring that "test" tasks utilise the required setup for JUnit 5
      useJUnitPlatform()

      // Setting up logging information for "test" tasks
      testLogging {
          exceptionFormat("full")
          events("started", "skipped", "passed", "failed")
          showStandardStreams = false
      }
  }
}
