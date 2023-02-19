package com.example.cartoonquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class i1 : AppCompatActivity() {

    lateinit var qu: ImageView
    lateinit var r1: RadioButton
    lateinit var r2: RadioButton
    lateinit var r3: RadioButton
    lateinit var r4: RadioButton
    lateinit var next: Button
    lateinit var group: RadioGroup
    lateinit var layout: LinearLayout

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
        var layout = findViewById<ConstraintLayout>(R.id.layout)
        var score = findViewById<TextView>(R.id.score)

        finish.setOnClickListener{
            layout.visibility = View.VISIBLE
            score.text = z.toString()
        }


            qu = findViewById<ImageView>(R.id.qu)
            r1 = findViewById<RadioButton>(R.id.r1)
            r2 = findViewById<RadioButton>(R.id.r2)
            r3 = findViewById<RadioButton>(R.id.r3)
            r4 = findViewById<RadioButton>(R.id.r4)
            next = findViewById<Button>(R.id.next)
            group = findViewById<RadioGroup>(R.id.group)




            savollar.add(
                Test(
                    R.drawable.marinett,
                    "Cartoon Pawpatrol, Character SKYE",
                    "Cartoon Ladybug, Character MARINETT",
                    "Cartoon Ladybug, Character LILA",
                    "Cartoon Baby Boss, Character BOSS",
                    "Cartoon Ladybug, Character MARINETT"
                )
            )

            savollar.add(
                Test(
                    R.drawable.marshall,
                    "Cartoon Pawpatrol, Character CHESE",
                    "Cartoon Pawpatrol, Character ZUMA",
                    "Cartoon Pawpatrol, Character MARSHALL",
                    "Cartoon Pawpatrol, Character RIDER",
                    "Cartoon Pawpatrol, Character MARSHALL"
                )
            )


        savollar.add(
            Test(
                R.drawable.zuma,
                "Cartoon Pawpatrol, Character CHESE",
                "Cartoon Pawpatrol, Character ZUMA",
                "Cartoon Pawpatrol, Character MARSHALL",
                "Cartoon Pawpatrol, Character RIDER",
                "Cartoon Pawpatrol, Character ZUMA"
            )
        )


        savollar.add(
            Test(
                R.drawable.chase,
                "Cartoon Pawpatrol, Character CHESE",
                "Cartoon Pawpatrol, Character ZUMA",
                "Cartoon Pawpatrol, Character MARSHALL",
                "Cartoon Pawpatrol, Character RIDER",
                "Cartoon Pawpatrol, Character CHESE"
            )
        )

            question(0)


            r1.setOnClickListener {
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
                    q4++
                    z++
                }
            }

            r2.setOnClickListener {
                if (index == 0 && q1 > 0) {
                    z--
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

            r3.setOnClickListener {
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
                if (index == 3 && q4 > 0) {
                    z--
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
