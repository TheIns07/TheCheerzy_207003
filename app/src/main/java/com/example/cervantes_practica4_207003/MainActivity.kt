package com.example.cervantes_practica4_207003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button_getStarted) as Button

        button.setOnClickListener{
            var intent: Intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}