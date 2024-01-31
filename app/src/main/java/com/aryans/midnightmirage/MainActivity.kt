package com.aryans.midnightmirage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import android.widget.ImageButton

private const val INITIAL_COUNT = 0


class MainActivity : AppCompatActivity() {

    private lateinit var bCounter: Button
    private lateinit var tvCounter: TextView
    private lateinit var bNextPage: ImageButton
    private lateinit var tvFunny: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bCounter = findViewById(R.id.bCounter)
        tvCounter = findViewById(R.id.tvCounter)
        bNextPage = findViewById(R.id.bNextPage)
        tvFunny = findViewById(R.id.tvFunny)

        tvCounter.text = "$INITIAL_COUNT"

        bCounter.setOnClickListener {
            val Count = tvCounter.text.toString().toInt()
            val nCount = Count + 1
            tvCounter.text = "$nCount"
            nice()
        }

        bNextPage.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }

    private fun nice() {
        if (tvCounter.text.toString().toInt() == 69 || tvCounter.text.toString()
                .toIntOrNull() == 420
        ) {
            tvFunny.text = "Nice LOL!"
            return
        }
        tvFunny.text = ""
    }


}