package com.miguelrodriguez.miguel1.IMCCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.miguelrodriguez.miguel1.R
import java.text.DecimalFormat

class imcCalculatorActivity : AppCompatActivity() {
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private lateinit var tvHeight: TextView
    private lateinit var rsHheight: RangeSlider

    private var currentWeight: Int = 60;
    private var currentAge: Int = 18;
    private var currrentHeight:Int=120

    private lateinit var btnSubtrackWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvWeight: TextView

    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge:TextView

    private lateinit var btnCalculate:Button

    companion object {
        const val IMC_KEY="IMC_RESULT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        iniComponent()
        initListener()

        initUI()


    }


    private fun iniComponent() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHheight = findViewById(R.id.rsHeight)

        btnSubtrackWeight = findViewById(R.id.btnSubtrackWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWeight = findViewById(R.id.tvWeight)

        btnSubtractAge=findViewById(R.id.btnSubtractAge)
        btnPlusAge=findViewById(R.id.btnPlusAge)
        tvAge=findViewById(R.id.tvAge)

        btnCalculate=findViewById(R.id.btnCalculate)


    }

    private fun initListener() {
        viewMale.setOnClickListener {
            setGenderColor()
            changeGender()
        }
        viewFemale.setOnClickListener {
            setGenderColor()
            changeGender()
        }

        rsHheight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
            currrentHeight=value.toInt()
        }

        btnPlusWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnSubtrackWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }

        btnPlusAge.setOnClickListener {
            currentAge+=1
            setAge()
        }
        btnSubtractAge.setOnClickListener {
            currentAge-=1
            setAge()
        }

        btnCalculate.setOnClickListener {
            val resul =calculateIMC()
            navigateToResult(resul)
        }

    }

    private fun navigateToResult(resul: Double) {

        val intent=Intent(this,ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY,resul)
        startActivity(intent)
    }

    private fun calculateIMC():Double {
        val df=DecimalFormat("#.##")
        val imc=currentWeight/(currrentHeight.toDouble()/100*currrentHeight.toDouble()/100)
        val result=df.format(imc).toDouble()
//        Log.i("Miguel","IMC es: $result")
        return df.format(imc).toDouble()
    }

    private fun setAge() {
        tvAge.text=currentAge.toString()
    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString() + " kg"
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
//        getBackgroudColor(isMaleSelected)
//        getBackgroudColor(isFemaleSelected)

        viewMale.setCardBackgroundColor(getBackgroudColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroudColor(isFemaleSelected))

    }

    private fun getBackgroudColor(isSelectedBackground: Boolean): Int {


        val colorReference = if (isSelectedBackground) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }


        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {

        setGenderColor()
        setWeight()
        setAge()
    }


}