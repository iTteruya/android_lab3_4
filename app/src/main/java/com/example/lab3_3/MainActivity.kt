package com.example.lab3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toSecondButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toSecondButton = findViewById(R.id.toSecond)
        toSecondButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
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