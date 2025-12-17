package com.example.myandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var tvText = findViewById<TextView>(R.id.tvText)
        var btnSubmit = findViewById<Button>(R.id.btnSubmit)
        var etText = findViewById<EditText>(R.id.etText)

       btnSubmit.setOnClickListener { var etString = etText.text.toString().trim()

       tvText.text = "Hello $etString!"
       }



    }
}