package com.example.ewalle.classes

import android.app.Person
import com.example.ewalle.interfaces.ModelInterface

class ModelClass: ModelInterface {
    override fun getPersonList(): MutableList<com.example.ewalle.Person> {
        return mutableListOf<com.example.ewalle.Person>()
    }
}