package com.example.ewalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val peopleRecyclerView = findViewById<RecyclerView>(R.id.people_recyclerview)
        peopleRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val servicesRecyclerView = findViewById<RecyclerView>(R.id.services_recyclerview)
        servicesRecyclerView.layoutManager = GridLayoutManager(this, 2, RecyclerView.HORIZONTAL, true)
    }
}