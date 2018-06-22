package importre

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke

class GreetingPlugin : Plugin<Project> {

    private fun greeting(): String {
        return "Hello, World!"
    }

    override
    fun apply(project: Project): Unit = project.run {
        tasks {
            "greeting" {
                group = "kotlin-flavored"
                description = "코틀린 맛 그래들 플러그인"
                doLast {
                    greeting().run(::println)
                }
            }
        }
    }
}
