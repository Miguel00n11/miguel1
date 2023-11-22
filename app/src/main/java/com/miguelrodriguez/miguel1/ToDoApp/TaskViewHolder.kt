package com.miguelrodriguez.miguel1.ToDoApp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miguelrodriguez.miguel1.R

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvTask:TextView=view.findViewById(R.id.tvTask)
    private val cbTask:TextView=view.findViewById(R.id.cbTask)
    fun render(task: Task){
        tvTask.text=task.name

    }


}