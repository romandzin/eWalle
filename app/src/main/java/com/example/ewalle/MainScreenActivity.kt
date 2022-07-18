package com.example.ewalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainScreenActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val peopleRecyclerView = findViewById<RecyclerView>(R.id.people_recyclerview)
        peopleRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val carol = getDrawable(R.drawable.woman_icon)?.let { People(it, "Carol") }
        val peopleList = listOf(carol)
        peopleRecyclerView.adapter = PeopleRecyclerAdapter(peopleList as List<People>)

        val servicesRecyclerView = findViewById<RecyclerView>(R.id.services_recyclerview)
        servicesRecyclerView.layoutManager = GridLayoutManager(this, 2, RecyclerView.HORIZONTAL, true)

        drawerLayout = findViewById(R.id.drawer_layout)
    }

    fun openNavBar(view: View) {
        drawerLayout.openDrawer(GravityCompat.END)
    }

    fun closeNavBar(view: View) {
        drawerLayout.closeDrawer(GravityCompat.END)
    }
}