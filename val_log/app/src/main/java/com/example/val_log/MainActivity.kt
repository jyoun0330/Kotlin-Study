package com.example.val_log

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var value = "여기는 value"
        val value2 = "여기는 value2"

        value = "값이 변경됩니다"
//        value2 = "값을 변경할수 없다!"

        Log.e("MainActivity",value) //오류
        Log.w("MainActivity",value) //경고
        Log.i("MainActivity",value) //정보
        Log.d("MainActivity",value) //디버그
        Log.v("MainActivity",value) //상세

        Toast.makeText(this, value, Toast.LENGTH_LONG).show()
    }
}