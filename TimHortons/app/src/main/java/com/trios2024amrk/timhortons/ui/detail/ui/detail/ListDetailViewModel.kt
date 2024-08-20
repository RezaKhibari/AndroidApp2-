package com.trios2024amrk.timhortons.ui.detail.ui.detail

import androidx.lifecycle.ViewModel
import com.trios2024amrk.timhortons.TaskList

class ListDetailViewModel() : ViewModel() {

    lateinit var onTaskAdded: (() -> Unit)

    lateinit var list: TaskList

    fun addTask(task: String) {
        list.tasks.add(task)
        onTaskAdded.invoke()
    }

}
