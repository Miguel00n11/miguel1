package com.miguelrodriguez.miguel1.ToDoApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miguelrodriguez.miguel1.R

class ToDoActivity : AppCompatActivity() {
    private val categories= listOf(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Other
    )
    private lateinit var rvCategory: RecyclerView
    private lateinit var categoriesAdapter:CategoriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        initComponet()
        initUI()

    }

    private fun initComponet() {
        rvCategory=findViewById(R.id.rvCategorias)
    }
    private fun initUI() {
        categoriesAdapter= CategoriesAdapter(categories)
        rvCategory.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCategory.adapter=categoriesAdapter

    }
}
