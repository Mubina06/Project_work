package com.example.cartoonquiz

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.finish)

        var score = findViewById<TextView>(R.id.score)

}
}