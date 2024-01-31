package com.aryans.midnightmirage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.aryans.midnightmirage.R.*
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val INITIAL_VALUE = 100

class SecondActivity : AppCompatActivity() {

    private lateinit var bPreviousPage: ImageButton
    private lateinit var bDownCounter: Button
    private lateinit var etDownCounter: EditText
    private lateinit var tvCounter2: TextView
    private lateinit var tvFunny2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_second)

        bPreviousPage = findViewById(id.bPreviousPage)
        bDownCounter = findViewById(id.bDownCounter)
        etDownCounter = findViewById(id.etDownCounter)
        tvCounter2 = findViewById(id.tvCounter2)
        tvFunny2 = findViewById(id.tvFunny2)

        tvCounter2.text = "$INITIAL_VALUE"

        bPreviousPage.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        etDownCounter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                updateCounter()
            }

        })

        bDownCounter.setOnClickListener {
            val counter = tvCounter2.text.toString().toInt() - 1
            tvCounter2.text = "$counter"
            nice()
        }

    }


    private fun updateCounter() {
        if (etDownCounter.text.isEmpty()) {
            tvCounter2.text = "$INITIAL_VALUE"
            return
        }
        tvCounter2.text = etDownCounter.text.toString()
        nice()
    }

    private fun nice() {
        if (tvCounter2.text.toString().toInt() == 69 || tvCounter2.text.toString()
                .toIntOrNull() == 420
        ) {
            tvFunny2.text = "Nice LOL!"
            return
        }
        tvFunny2.text = ""
    }

}


