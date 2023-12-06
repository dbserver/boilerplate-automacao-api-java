plugins {
    id("bergs.pwx.gradle.testes.mobile")
}

subprojects {
	apply(plugin = "bergs.pwx.gradle.testes.mobile")
	
  dependencies {
		implementation("org.seleniumhq.selenium:selenium-java:+")

    // Use Rest Assured for REST API test automations
    implementation("io.rest-assured:rest-assured:5.3.0")

    // Use JSON Path for extra API JSON response handling
    implementation("io.rest-assured:json-path:5.3.0")
	}
}
