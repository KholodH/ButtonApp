package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var result1 = 0
    lateinit var add: Button
    lateinit var minus: Button
    lateinit var num: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add = findViewById<Button>(R.id.buttonplus)
        minus = findViewById<Button>(R.id.buttonmin)
        num = findViewById<TextView>(R.id.numberstxt)

        add.setOnClickListener {
            opration(true)
        }
        minus.setOnClickListener {
            opration(false)
        }

    }


    private fun opration(b: Boolean) {
        when {
            result1 > 0 -> num.setTextColor(getResources().getColor(R.color.green))


        result1 == 0 ->   num.setTextColor(getResources().getColor(R.color.black))

        result1 < 0 ->  num.setTextColor(getResources().getColor(R.color.red)) //white
    }
    if (b)
    {
        result1++
    }
    else
    {
        result1--
    }
    num.text=result1.toString()
}
    }





