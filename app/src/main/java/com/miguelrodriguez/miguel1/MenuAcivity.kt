package com.miguelrodriguez.miguel1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.miguelrodriguez.miguel1.IMCCalculator.imcCalculatorActivity
import com.miguelrodriguez.miguel1.firstApp.FirstActivity

class MenuAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_acivity)

        val btnSaludar=findViewById<Button>(R.id.btnSaludar)
        val btnIMCApp=findViewById<Button>(R.id.btnIMCApp)
        btnSaludar.setOnClickListener{navegateToSaludar()}
        btnIMCApp.setOnClickListener { navigateToIMCApp() }


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

