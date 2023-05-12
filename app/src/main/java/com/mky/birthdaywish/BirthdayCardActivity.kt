package com.mky.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BirthdayCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val name = intent.getStringExtra("name")
       findViewById<TextView>(R.id.birthdayCardName).text = "Happy Birthday\n $name"

    }
}