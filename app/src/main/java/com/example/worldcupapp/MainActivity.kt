package com.example.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)

        val wcArray = arrayOf("Germany", "Brazil", "England", "Spain", "Qatar")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this, R.layout.list_item, R.id.textView, wcArray)

        listView.adapter = arrayAdapter

    }
}