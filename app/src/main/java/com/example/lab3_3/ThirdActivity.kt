package com.example.lab3_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ThirdActivity: AppCompatActivity() {
    lateinit var toFirstButton: Button
    lateinit var toSecondButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        toFirstButton = findViewById(R.id.toFirst)
        toFirstButton.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        toSecondButton = findViewById(R.id.toSecond)
        toSecondButton.setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        val aboutMenu = findViewById<BottomNavigationView>(R.id.activity_about)
        aboutMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.about -> {
                    startActivity(Intent(this, AboutActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
                        .addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY))
                }
            }
            true
        }
    }
}