package com.example.twice_lecture02

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_inside)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        if (getData == "1"){
            memberImage.setImageResource(R.drawable.member_1)
        }
        if (getData == "2"){
            memberImage.setImageResource(R.drawable.member_2)
        }
        if (getData == "3"){
            memberImage.setImageResource(R.drawable.member_3)
        }
        if (getData == "4"){
            memberImage.setImageResource(R.drawable.member_4)
        }
        if (getData == "5"){
            memberImage.setImageResource(R.drawable.member_5)
        }
        if (getData == "6"){
            memberImage.setImageResource(R.drawable.member_6)
        }
        if (getData == "7"){
            memberImage.setImageResource(R.drawable.member_7)
        }
        if (getData == "8"){
            memberImage.setImageResource(R.drawable.member_8)
        }
        if (getData == "9"){
            memberImage.setImageResource(R.drawable.member_9)
        }
    }
}