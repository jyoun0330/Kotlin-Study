package com.example.listview_ex


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val list : MutableList<listViewModel>) : BaseAdapter(){
    override fun getCount(): Int {
        //item의 갯수
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (convertView == null){
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item , parent, false)
        }

        val title = convertView.findViewById<TextView>(R.id.listviewItem)
        val content = convertView.findViewById<TextView>(R.id.listviewItem2)
        title.text = list[position].title
        content.text = list[position].content
        return convertView!!
    }

}