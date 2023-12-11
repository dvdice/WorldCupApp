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

        val adapter = MyAdapter(this, generateData())

        listView?.adapter = adapter
    }

    fun generateData(): ArrayList<CountryModel>{
        val result = ArrayList<CountryModel>()

        val country1 = CountryModel(
            "Brazil",
            "5",
            R.drawable.brazil
        )
        val country2 = CountryModel(
            "Germany",
            "2",
            R.drawable.germany
        )
        val country3 = CountryModel(
            "France",
            "5",
            R.drawable.france
        )
        val country4 = CountryModel(
            "Spain",
            "5",
            R.drawable.spain
        )
        val country5 = CountryModel(
            "UK",
            "5",
            R.drawable.unitedkingdom
        )
        val country6 = CountryModel(
            "US",
            "5",
            R.drawable.unitedstates
        )
        val country7 = CountryModel(
            "Saudi",
            "5",
            R.drawable.saudiarabia
        )
        result.add(country1)
        result.add(country2)
        result.add(country3)
        result.add(country4)
        result.add(country5)
        result.add(country6)
        result.add(country7)
        return result
    }
}