package com.miguelrodriguez.miguel1.IMCCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.miguelrodriguez.miguel1.IMCCalculator.imcCalculatorActivity.Companion.IMC_KEY
import com.miguelrodriguez.miguel1.R

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalcualte:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)

        val result:Double=intent.extras?.getDouble(IMC_KEY)?:-1.0

        initComponent()
        initUI(result)
        initiListener()

    }

    private fun initiListener() {
        btnRecalcualte.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text=result.toString()
        when(result){
            in 0.00..18.50->{//Bajo peso
                tvResult.text=getString(R.string.title_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
                tvDescription.text=getString(R.string.description_bajo_peso)
            }
            in 18.51..24.99->{//Peso normal
                tvResult.text=getString(R.string.title_bajo_normal)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                tvDescription.text=getString(R.string.description_normal)
            }
            in 25.00..29.99->{//Sobre peso
                tvResult.text=getString(R.string.title_bajo_sobrepeso)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.sobrePeso))
                tvDescription.text=getString(R.string.description_sobrepeso)
            }
            in 30.00..99.00->{//Obesidad
                tvResult.text=getString(R.string.title_bajo_Obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesidad))
                tvDescription.text=getString(R.string.description_Obesidad)
            }
            else->{//Error
                tvIMC.text=getString(R.string.error)
                tvResult.text=getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesidad))
                tvDescription.text=getString(R.string.error)
            }
        }
    }

    private fun initComponent() {
        tvIMC=findViewById(R.id.tvIMC)
        tvResult=findViewById(R.id.tvResult)
        tvDescription=findViewById(R.id.tvDescription)
        btnRecalcualte=findViewById(R.id.btnReCalculate)
    }
}