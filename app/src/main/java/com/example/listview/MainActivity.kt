package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var colorArrays = resources.getStringArray(R.array.Colors)
        var arrayAdapter = ArrayAdapter<string>(this, android.R.layout.simple_list_item_1, colorArrays)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, position: Int, id: Long ->

            toast(colorArrays[position])
        }
    }
}