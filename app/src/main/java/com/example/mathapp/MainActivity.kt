package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var welcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome = findViewById(R.id.Welcome)
        welcome.text = "Welcome to the game! Choose what you would like to do:"

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.text = "Add numbers!"

        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.text = "Subtract numbers!"

        val buttonMultiplicate = findViewById<Button>(R.id.buttonMultiplicate)
        buttonMultiplicate.text = "Multiplicate numbers!"

        buttonAdd.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }

        buttonSubtract.setOnClickListener {}

        buttonMultiplicate.setOnClickListener {}
    }
}