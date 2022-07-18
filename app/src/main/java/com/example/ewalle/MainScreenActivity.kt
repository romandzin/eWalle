package com.example.ewalle

import android.app.Person
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.Toolbar
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ewalle.classes.PresenterClass
import com.example.ewalle.interfaces.ViewInterface
import com.google.android.material.navigation.NavigationView

class MainScreenActivity : AppCompatActivity(), ViewInterface {

    lateinit var drawerLayout: DrawerLayout
    lateinit var peopleRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val presenter = PresenterClass()
        presenter.startPresenter(this)

        peopleRecyclerView = findViewById(R.id.people_recyclerview)
        getDrawable(R.drawable.woman_icon)?.let { presenter.createPerson(it, "Carol") }

        val servicesRecyclerView = findViewById<RecyclerView>(R.id.services_recyclerview)
        servicesRecyclerView.layoutManager = GridLayoutManager(this, 2, RecyclerView.HORIZONTAL, true)

        showBalance("20,600")
        getDrawable(R.drawable.woman_icon)?.let { showAccountData(it, "Carol Black", "Seattle, Washington") }

        drawerLayout = findViewById(R.id.drawer_layout)
    }

    fun openNavBar(view: View) {
        drawerLayout.openDrawer(GravityCompat.END)
    }

    fun closeNavBar(view: View) {
        drawerLayout.closeDrawer(GravityCompat.END)
    }


    override fun showBalance(balance: String) {
        val balanceView = findViewById<TextView>(R.id.balance)
        balanceView.text = balance
    }

    override fun showPerson(personList: MutableList<com.example.ewalle.Person>) {
        peopleRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        peopleRecyclerView.adapter = PeopleRecyclerAdapter(personList)
    }

    override fun showAccountData(icon: Drawable, name: String, place: String) {
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        val navViewHeader = navigationView.getHeaderView(0)

        val accountIconView = navViewHeader.findViewById<ImageView>(R.id.account_icon)
        accountIconView.setImageDrawable(icon)

        val accountNameView = navViewHeader.findViewById<TextView>(R.id.account_name)
        accountNameView.text = name

        val accountPlaceView = navViewHeader.findViewById<TextView>(R.id.account_place)
        accountPlaceView.text = place
    }
}