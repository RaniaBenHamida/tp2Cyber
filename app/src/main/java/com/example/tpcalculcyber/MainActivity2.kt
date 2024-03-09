package com.example.tpcalculcyber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    lateinit var rclNames: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rclNames = findViewById(R.id.rclNames)
        rclNames.setHasFixedSize(true)

        val listOfNames = listNames()
        val adapter = NameAdapter(listOfNames)
        rclNames.adapter = adapter
        rclNames.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    // This function just creates a list of names for us
    private fun listNames(): MutableList<String> {
        var nameList = mutableListOf<String>()
        nameList.add("ahmed")
        nameList.add("yassine")
        nameList.add("sonia")
        nameList.add("mariem")
        nameList.add("taha")
        nameList.add("oussema")
        nameList.add("fatma")
        nameList.add("haythem")
        nameList.add("ayoub")
        nameList.add("aya")
        nameList.add("houda")
        return nameList
    }
}
