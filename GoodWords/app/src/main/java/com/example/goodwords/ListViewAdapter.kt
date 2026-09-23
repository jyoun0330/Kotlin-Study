package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val list : MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any? {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(
        p0: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var convertView = convertView

        if (convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }
        val listViewText = convertView.findViewById<TextView>(R.id.listViewTextArea)
        listViewText!!.text = list[p0]

        return convertView
    }
}