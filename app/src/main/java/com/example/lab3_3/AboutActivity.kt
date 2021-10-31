package com.example.lab3_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity: AppCompatActivity() {

    private lateinit var noButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_about)

        noButton = findViewById(R.id.noActivity)
        noButton.setOnClickListener {
            startActivity(
                Intent(this, NoActivity::class.java))
        }
    }
}