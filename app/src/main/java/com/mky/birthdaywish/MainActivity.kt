package com.mky.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateBirthdayCard(view: View) {
        intent = Intent(this, BirthdayCardActivity::class.java)
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        if(name == "")
        {
            Toast.makeText(this,"Please Enter Name ",Toast.LENGTH_LONG).show()

        }
        else {
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}