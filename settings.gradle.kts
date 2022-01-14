rootProject.name = "myproject"

include("core", "bukkit", "sponge")

rootProject.children.forEach { project ->
    project.name = "${rootProject.name}-${project.name}"
}
