package com.example.cartoonquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class i5 : AppCompatActivity() {

    lateinit var qu: ImageView
    lateinit var r1: RadioButton
    lateinit var r2: RadioButton
    lateinit var r3: RadioButton
    lateinit var r4: RadioButton
    lateinit var next: Button
    lateinit var group: RadioGroup

    var index=0
    var savollar = arrayListOf<Test>()
    var z = 0
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.i1)

        var nickname = findViewById<EditText>(R.id.nickname)
        var nick = findViewById<TextView>(R.id.nick)
        var finish = findViewById<Button>(R.id.finish)

        var score = findViewById<TextView>(R.id.score)
        var layout = findViewById<ConstraintLayout>(R.id.layout)

        finish.setOnClickListener{
            layout.visibility = View.VISIBLE
            score.text = z.toString()
        }

//        nick.text = nickname.text.toString()


        qu = findViewById<ImageView>(R.id.qu)
        r1 = findViewById<RadioButton>(R.id.r1)
        r2 = findViewById<RadioButton>(R.id.r2)
        r3 = findViewById<RadioButton>(R.id.r3)
        r4 = findViewById<RadioButton>(R.id.r4)
        next = findViewById<Button>(R.id.next)
        group = findViewById<RadioGroup>(R.id.group)


        savollar.add(
            Test(
                R.drawable.baymax,
                "Cartoon Baymax",
                "Cartoon Makvin",
                "Cartoon Truck",
                "Cartoon Tayo",
                "Cartoon Truck"
            )
        )

        savollar.add(
            Test(
                R.drawable.bigheroo,
                "Cartoon Makvin",
                "Cartoon Ladybug",
                "Cartoon Big Hero",
                "Cartoon Baby Boss",
                "Cartoon Big Hero"
            )
        )

        savollar.add(
            Test(
                R.drawable.boltsandblip,
                "Cartoon Pawpatrol",
                "Cartoon Bolts & Blip",
                "Cartoon Winx",
                "Cartoon Tayo",
                "Cartoon Bolts & Blip"
            )
        )

        savollar.add(
            Test(
                R.drawable.thebotsmaster,
                "Cartoon Winx",
                "Cartoon Speed Buggy",
                "Cartoon Makvin",
                "Cartoon The bots master",
                "Cartoon The bots master"
            )
        )



        question(0)


        r1.setOnClickListener {
            if (index == 0 && q1 == 0) {
                q1++
                z++
            }
            if (index == 1 && q2 > 0) {
                z--
            }
            if (index == 2 && q3 == 0) {
                q3++
                z++
            }
            if (index == 3 && q4 > 0) {
                z--
            }
        }

        r2.setOnClickListener {
            if (index == 0 && q1 > 0) {
                z--
            }
            if (index == 1 && q2 == 0) {
                q2++
                z++
            }
            if (index == 2 && q3 > 0) {
                z--
            }
            if (index == 3 && q4 > 0) {
                z--
            }
        }

        r3.setOnClickListener {
            if (index == 0 && q1 == 0) {
                z++
                q1++
            }
            if (index == 1 && q2 > 0) {
                z--
            }
            if (index == 2 && q3 > 0) {
                z--
            }
            if (index == 3 && q4 > 0) {
                z--
            }
        }
        r4.setOnClickListener {
            if (index == 0 && q1 > 0) {
                z--
            }
            if (index == 1 && q2 > 0) {
                z--
            }
            if (index == 2 && q3 > 0) {
                z--
            }
            if (index == 3 && q4 == 0) {
                z++
                q4++
            }
        }

        next.setOnClickListener {
            if (index == 3) {
                index = 0
                question(index)
                group.clearCheck()
            } else {
                index++
                question(index)
                group.clearCheck()

            }
        }
    }

    fun question(index:Int){
        var test1=savollar[index]
        qu.setImageResource(test1.img)
        r1.text=test1.variant1
        r2.text=test1.variant2
        r3.text=test1.variant3
        r4.text=test1.variant4

    }

}
