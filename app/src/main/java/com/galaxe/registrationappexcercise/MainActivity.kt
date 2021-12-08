package com.galaxe.registrationappexcercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
    fun login(v: View){

        intent = Intent(this, loginPage::class.java )
        startActivity(intent)
    }
    fun register(v: View){

        intent = Intent(this, Registration::class.java )
        startActivity(intent)
    }

}