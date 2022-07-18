package com.example.ewalle.classes

import android.app.Person
import android.graphics.drawable.Drawable
import android.view.View
import com.example.ewalle.MainScreenActivity
import com.example.ewalle.interfaces.PresenterInterface

class PresenterClass: PresenterInterface {

    val model = ModelClass()
    lateinit var viewMainScreenActivity: MainScreenActivity

    override fun startPresenter(view: MainScreenActivity) {
        viewMainScreenActivity = view
    }

    override fun createPerson(icon: Drawable, name: String) {
        val personList = model.getPersonList()
        val new_person = com.example.ewalle.Person(icon, name)
        personList.add(new_person)
        viewMainScreenActivity.showPerson(personList)
    }
}