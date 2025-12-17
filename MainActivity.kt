package com.example.interactiveapp

import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.bthRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener {
            layout.setBackgroundResource(R.color.Yellow)
        }
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

    }
}