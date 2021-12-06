package com.galaxe.registrationappexcercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loginPage : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        userName = findViewById(R.id.user)
        password = findViewById(R.id.pass)



    }
    fun verifyLogin(v: View){
        if(userName.text.toString() == "admin" && password.text.toString() == "admin123")
            Toast.makeText(this, "Logged in!", Toast.LENGTH_LONG).show()
        else Toast.makeText(this, "Wrong!", Toast.LENGTH_LONG).show()
    }
    fun back(v: View){
        intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }
}