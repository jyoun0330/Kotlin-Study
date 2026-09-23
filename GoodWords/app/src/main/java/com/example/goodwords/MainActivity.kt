package com.example.goodwords

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

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

        val sentenceList = mutableListOf<String>()
        sentenceList.add("대충명언같은문장")
        sentenceList.add("그래도 다른걸 적어야겠죠 ")
        sentenceList.add("잠봉뵈르먹고싶다")
        sentenceList.add("대충명언같은문장2")
        sentenceList.add("대충명언같은문장3")




        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)

            binding.goodWordTextArea.setText(sentenceList.random())
        }
    }
}