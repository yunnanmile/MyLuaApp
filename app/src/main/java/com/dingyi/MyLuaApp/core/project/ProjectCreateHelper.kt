package com.dingyi.MyLuaApp.core.project

import android.app.Activity
import com.dingyi.MyLuaApp.base.BaseActivity
import com.dingyi.MyLuaApp.core.task.SimpleAsyncTask

/** 创建项目的帮助类，帮助创建工程
 *
 */
class ProjectCreateHelper(private val activity: BaseActivity<*>) {
    private var choosePos=0
    private var toPath=""
    private var name=""
    private var packageName=""


    fun setProjectName(name: String):ProjectCreateHelper {
        this.name = name
        return this;
    }

    fun setProjectPackageName(name: String):ProjectCreateHelper {
        this.packageName = name
        return this;
    }

    fun setProjectPath(name: String):ProjectCreateHelper {
        this.toPath = name
        return this;
    }

    fun setChoosePos(name: Int):ProjectCreateHelper {
        this.choosePos = name
        return this;
    }

    fun execute(callback: Runnable) {
        SimpleAsyncTask.postTask({
            createProject(activity,choosePos,toPath,name,packageName)
        },callback)
    }

}