package com.aryans.midnightmirage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val INITITAL_COUNT = 0

class MainActivity : AppCompatActivity() {

    private lateinit var bCounter: Button
    private lateinit var tvCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bCounter = findViewById(R.id.bCounter)
        tvCounter = findViewById(R.id.tvCounter)

        tvCounter.text = "$INITITAL_COUNT"

        bCounter.setOnClickListener {
            val Count = tvCounter.text.toString().toInt()
            val nCount = Count + 1
            tvCounter.text = "$nCount"
        }



    }
}