package com.example.cartoonquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        var img1 = findViewById<ImageView>(R.id.img1)
        var img2 = findViewById<ImageView>(R.id.img2)
        var img3 = findViewById<ImageView>(R.id.img3)
        var img4 = findViewById<ImageView>(R.id.img4)
        var img5 = findViewById<ImageView>(R.id.img5)
        var img6 = findViewById<ImageView>(R.id.img6)

        img1.setOnClickListener{
            var intent1: Intent = Intent(this, i1::class.java)
            startActivity(intent1)
        }

        img2.setOnClickListener{
            var intent2: Intent = Intent(this, i2::class.java)
            startActivity(intent2)
        }

        img3.setOnClickListener{
            var intent3: Intent = Intent(this, i3::class.java)
            startActivity(intent3)
        }

        img4.setOnClickListener{
            var intent4: Intent = Intent(this, i4::class.java)
            startActivity(intent4)
        }

        img5.setOnClickListener{
            var intent5: Intent = Intent(this, i5::class.java)
            startActivity(intent5)
        }

        img6.setOnClickListener{
            var intent6: Intent = Intent(this, i6::class.java)
            startActivity(intent6)
        }

    }
}