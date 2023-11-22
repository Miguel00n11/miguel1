package com.miguelrodriguez.miguel1.ToDoApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.miguelrodriguez.miguel1.R

class CategoriesAdapter(private val categories: List<TaskCategory>) : RecyclerView.Adapter<CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_categoy, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val category = categories[position]
        holder.render(category)

        // Manejar la selección de la categoría
        holder.itemView.setOnClickListener {
            category.isSelected = !category.isSelected
            notifyDataSetChanged() // Actualizar la vista después de la selección
        }
    }

    override fun getItemCount() = categories.size
}
