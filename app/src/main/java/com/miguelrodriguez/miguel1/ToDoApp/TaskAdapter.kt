package com.miguelrodriguez.miguel1.ToDoApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miguelrodriguez.miguel1.R

class TaskAdapter(val tasks:List<Task>):RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task,parent,false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(tasks[position])
    }

    override fun getItemCount()=tasks.size

}