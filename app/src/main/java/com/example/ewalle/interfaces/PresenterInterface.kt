package com.example.ewalle.interfaces

import android.app.Person
import android.graphics.drawable.Drawable
import android.view.View
import com.example.ewalle.MainScreenActivity

interface PresenterInterface {

    fun startPresenter(view: MainScreenActivity)

    fun createPerson(icon: Drawable, name: String)
}