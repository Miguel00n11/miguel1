package com.miguelrodriguez.miguel1.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.miguelrodriguez.miguel1.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val tvResult=findViewById<TextView>(R.id.tvResult)
        val name:String=intent.extras!!.getString("edadUsuario").toString()
        tvResult.text="Hola $name"


    }



}