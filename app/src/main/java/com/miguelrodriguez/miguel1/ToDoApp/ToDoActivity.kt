package com.miguelrodriguez.miguel1.ToDoApp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.miguelrodriguez.miguel1.R
import com.miguelrodriguez.miguel1.ToDoApp.TaskCategory.*

//import com.miguelrodriguez.miguel1.ToDoApp.TaskCategory.*

//import com.miguelrodriguez.miguel1.ToDoApp

class ToDoActivity : AppCompatActivity() {
    private val categories = listOf(
        Personal,
        Business,
        Other
    )
    private val tasks = mutableListOf(
        Task("PruebaPersonal", Personal),
        Task("PruebaBusiness", Business),
        Task("PruebaOther", Other)
    )
    private lateinit var rvCategory: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    private lateinit var fabAdTask:FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        initComponet()
        initUI()
        initListeners()

    }

    private fun initListeners() {
        fabAdTask.setOnClickListener { showDialog() }
    }
    private fun showDialog(){
        val dialog=Dialog(this)
        dialog.setContentView(R.layout.dialog_task)
        dialog.show()



    }

    private fun initComponet() {
        rvCategory = findViewById(R.id.rvCategorias)
        rvTasks = findViewById(R.id.rvTasks)
        fabAdTask=findViewById(R.id.fabAdTask)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategory.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(tasks)
        rvTasks.layoutManager=LinearLayoutManager(this)
        rvTasks.adapter=taskAdapter

    }
}
