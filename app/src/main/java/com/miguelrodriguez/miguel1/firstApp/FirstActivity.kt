package com.miguelrodriguez.miguel1.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.miguelrodriguez.miguel1.R
import kotlin.math.log

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStar)
        val etEdad=findViewById<EditText>(R.id.etEdad)


        btnStart.setOnClickListener {

            val name =etName.text.toString()
            val edad=etEdad.text.toString()
            if (name.isNotEmpty()){

                val intent=Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)

                val intent2=Intent(this,ResultActivity::class.java)
                intent2.putExtra("edadUsuario",edad)
                startActivity(intent2)

            }



        }
        //Al arrancar la pantalla
    }
}