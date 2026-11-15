package com.example.contactsmobileapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Student Name: Brendan Tice
// Date: November 15, 2026
// Course: SDC340
// Assignment: 1.5 Contacts Mobile App

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactOneButton =
            findViewById<Button>(R.id.btnContactOne)

        val contactTwoButton =
            findViewById<Button>(R.id.btnContactTwo)

        contactOneButton.setOnClickListener {
            val intent = Intent(
                this,
                ContactOneActivity::class.java
            )
            startActivity(intent)
        }

        contactTwoButton.setOnClickListener {
            val intent = Intent(
                this,
                ContactTwoActivity::class.java
            )
            startActivity(intent)
        }
    }
}
