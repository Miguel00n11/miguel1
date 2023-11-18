package com.miguelrodriguez.miguel1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.miguelrodriguez.miguel1.IMCCalculator.imcCalculatorActivity
import com.miguelrodriguez.miguel1.ToDoApp.ToDoActivity
import com.miguelrodriguez.miguel1.firstApp.FirstActivity

class MenuAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_acivity)

        val btnSaludar=findViewById<Button>(R.id.btnSaludar)
        val btnIMCApp=findViewById<Button>(R.id.btnIMCApp)
        val btnToDoApp=findViewById<Button>(R.id.btnToDo)
        btnSaludar.setOnClickListener{navegateToSaludar()}
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        btnToDoApp.setOnClickListener { navegateToToDoApp() }


    }

    private fun navegateToToDoApp() {
        val intent=Intent(this,ToDoActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToIMCApp() {
        val intent=Intent(this,imcCalculatorActivity::class.java)
        startActivity(intent)

    }

    private fun navegateToSaludar(){
        val intent1=Intent(this,FirstActivity::class.java)
        startActivity(intent1)
    }
}

