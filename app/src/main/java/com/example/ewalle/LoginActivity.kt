package com.example.ewalle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.supportActionBar?.hide()
    }

    fun moveToMainScreen(view: View) {
        val intent = Intent(this, MainScreenActivity::class.java)
        startActivity(intent)
    }
}