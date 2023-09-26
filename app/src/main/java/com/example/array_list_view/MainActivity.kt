package com.example.array_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentArray = arrayListOf("Rohit", "Azim", "Bipul","Ritesh","Abhijeet","Vivek","Pradeep","Ajit","Rohit",
            "Azim", "Bipul","Ritesh","Abhijeet","Vivek","Pradeep","Ajit","Rohit", "Azim", "Bipul","Ritesh","Abhijeet","Vivek","Pradeep","Ajit","Rohit",
            "Azim", "Bipul","Ritesh","Abhijeet","Vivek","Pradeep","Ajit")

        val studentArrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1 , studentArray)

        val studentListView= findViewById<ListView>(R.id.ListView)

        studentListView.adapter = studentArrayAdapter

    }
}