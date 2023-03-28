package com.example.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.system.Os.bind
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var fiveCents: Button
    private lateinit var tenCents: Button
    private lateinit var quater: Button
    private lateinit var oneDollar: Button
    private lateinit var counter: TextView

    private var totalMoney = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
/*
        if (savedInstanceState != null){
            fiveCents.text = savedInstanceState?.getInt(totalMoney.toString()).toString()
            tenCents.text = savedInstanceState?.getInt(totalMoney.toString()).toString()
            quater.text = savedInstanceState?.getInt(totalMoney.toString()).toString()
            oneDollar.text = savedInstanceState?.getInt(totalMoney.toString()).toString()

        } else {
            fiveCents.text = totalMoney.toString()
            tenCents.text = totalMoney.toString()
            quater.text = totalMoney.toString()
            oneDollar.text = totalMoney.toString()
        }

        addListener()

 */
    }

    private fun bind() {
        /*
        fiveCents = findViewById(R.id.imageView)
        tenCents = findViewById(R.id.imageView2)
        quater = findViewById(R.id.imageView3)
        oneDollar = findViewById(R.id.imageView4)
        counter = findViewById(R.id.textView2)

         */
    }

    private fun addListener() {
        /*
        fiveCents.setOnClickListener {
            totalMoney + 0.05
            fiveCents.text = totalMoney.toString()
        }

        tenCents.setOnClickListener {
            totalMoney + 0.10
            tenCents.text = totalMoney.toString()
        }

        quater.setOnClickListener {
            totalMoney + 0.05
            quater.text = totalMoney.toString()
        }

        oneDollar.setOnClickListener {
            totalMoney + 0.10
            oneDollar.text = totalMoney.toString()
        }
        */

    }
/*
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState)

        outState.apply {
            putInt(TOTAL_MONEY, totalMoney)
        }
    }

    companion object {
        const val TOTAL_MONEY = "Total"

    }
    
 */
}