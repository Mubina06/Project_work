package com.example.cartoonquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_acitivity)

        var start = findViewById<Button>(R.id.start)

        start.setOnClickListener{
            var intent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}