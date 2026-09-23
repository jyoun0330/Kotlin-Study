package com.example.listview_ex

import android.os.Bundle
import android.widget.ListView
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
//        val list_item = mutableListOf<String>()
//
//        list_item.add("a")
//        list_item.add("b")
//        list_item.add("c")

        val list_item = mutableListOf<listViewModel>()
        list_item.add(listViewModel("a", "b"))
        list_item.add(listViewModel("c", "d"))
        list_item.add(listViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListview)

        //Mainactivity -> adapter
        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter
    }
}