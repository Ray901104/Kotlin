package com.yrcho.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener{
            timesClicked += 1
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey Ray!", Toast.LENGTH_LONG).show() // Toast 표시
        }
    }
}