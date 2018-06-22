plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    (plugins) {
        "greeting-plugin" {
            id = "greeting"
            implementationClass = "importre.GreetingPlugin"
        }
    }
}
