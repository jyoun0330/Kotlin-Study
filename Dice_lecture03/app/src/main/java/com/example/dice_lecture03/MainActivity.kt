package com.example.dice_lecture03

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.dice_lecture03.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceimage1 = binding.dice1
        val diceimage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 GO", Toast.LENGTH_LONG).show()

//            Log.d("MainActivity", Random.nextInt(1, 7).toString())
//            Log.d("MainActivity", Random.nextInt(1, 7).toString())

            val number1 = Random.nextInt(1, 7)
            val number2 = Random.nextInt(1, 7)

            if (number1 == 1){
                diceimage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2){
                diceimage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3){
                diceimage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4){
                diceimage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5){
                diceimage1.setImageResource(R.drawable.dice_5)
            } else {
                diceimage1.setImageResource((R.drawable.dice_6))
            }

            if (number2 == 1){
                diceimage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2){
                diceimage2.setImageResource(R.drawable.dice_2)
            } else if (number2 == 3){
                diceimage2.setImageResource(R.drawable.dice_3)
            } else if (number2 == 4){
                diceimage2.setImageResource(R.drawable.dice_4)
            } else if (number2 == 5){
                diceimage2.setImageResource(R.drawable.dice_5)
            } else {
                diceimage2.setImageResource((R.drawable.dice_6))
            }

        }




    }
}