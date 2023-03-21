package com.example.laboratorio_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun binding(){
        weightEditText = findViewById(R.id)
    }

    private  fun setListener(){
        actionCalculate.setOnClickListener {
            val weight = weightEditText.text.toString()
            val height = heightEditText.text.toString()

            if (!validateInput(weight,height)){

                return@setOnClickListener
            }

            weightEditText.clearFocus()
            heightEditText.clearFocus()

            val bmi = calculateBIM(weight.toFloat, heigh.toFloat).toFloat
        }
    }

    private  fun calculateBIM(weight:Float, height: Float): Float{
        return weight / (height/100) * (height / 100)
    }

    private  fun calculateBIM(weight:String, height: String): String{
        when{
            weight.isNullOrEmpty() -> {
                Toast.makeText(this, "weight is empty", Toast.LENGTH_SHORT).show()
                return false
            }
            height.isNullOrEmpty() -> {
                Toast.makeText(this, "weight is empty", Toast.LENGTH_SHORT).show()
                return false
            }
        }
        return true
    }

    private fun displayResult(bmi:Float){
        bmiTextView = bmi.toString()
        infoTextView = ("normal range")

        var informationResult = ""
        var color = 0

        when {
            bmi < 18.50 -> {
                informationResult = "under weight"
                color = R.color.under_weight
            }

                bmi in 18.50 .. 24.99 -> {
                informationResult = "healthy"
                color = R.color.normal_weight
            }
            bmi in 24.99 .. 29.99 -> {
                informationResult = "over weight"
                color = R.color.over_weight
            }
            bmi > 29.99 -> {
                informationResult = "obese"
                color = R.color.obese
            }

        }

        resultTextView.setTextColor(ContextCompat. getColor(this,color))
        resulTextView.text = informationResult
    }
}