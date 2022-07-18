package com.example.ewalle.interfaces

import android.app.Person
import android.graphics.drawable.Drawable

interface ViewInterface {

    fun showBalance(balance: String)

    fun showPerson(personList: MutableList<com.example.ewalle.Person>)

    fun showAccountData(icon: Drawable, name: String, place: String)
}