package importre

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke

class GreetingPlugin : Plugin<Project> {

    private fun greeting(userName: String?): String {
        return "Hello, ${userName ?: "World"}!"
    }

    override
    fun apply(project: Project): Unit = project.run {
        val ext = extensions.create("greeting", GreetingExt::class.java)
        tasks {
            "greeting" {
                group = "kotlin-flavored"
                description = "코틀린 맛 그래들 플러그인"
                doLast {
                    greeting(ext.userName).run(::println)
                }
            }
        }
    }
}
