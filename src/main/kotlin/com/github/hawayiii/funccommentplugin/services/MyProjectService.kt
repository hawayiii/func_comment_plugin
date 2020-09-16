package com.github.hawayiii.funccommentplugin.services

import com.intellij.openapi.project.Project
import com.github.hawayiii.funccommentplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
