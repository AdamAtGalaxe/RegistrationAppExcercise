package com.galaxe.registrationappexcercise

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class loginPage : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        supportActionBar?.hide()
        userName = findViewById(R.id.user)
        password = findViewById(R.id.pass)

    }
    fun verifyLogin(v: View){
        if(userName.text.toString() == "admin" && password.text.toString() == "admin123") {



            var sharedPref : SharedPreferences = this.getSharedPreferences("Myfile", Context.MODE_PRIVATE)
            var sfedit : SharedPreferences.Editor = sharedPref.edit()

            sfedit.putString("name", userName.text.toString())
            sfedit.putString("pass", password.text.toString())

            sfedit.commit()

            Toast.makeText(this, "Logged in!", Toast.LENGTH_LONG).show()
            intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
        else if(userName.text.toString() == "" && password.text.toString() == "") {
            var msg = "Username and/or password are empty."
            showAlert(v, msg)
        }
        else{
            var msg = "Username and/or password are incorrect."
            showAlert(v, msg)
        }

    }
    fun back(v: View){
        finish()
        //intent = Intent(this, MainActivity::class.java )
        //startActivity(intent)
    }
    fun showAlert(v: View, msg: String){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Error")
        alert.setMessage(msg)
        alert.setIcon(android.R.drawable.ic_dialog_alert)
        alert.setPositiveButton("OK"){dialog, which ->
            Toast.makeText(this, "Continue", Toast.LENGTH_LONG).show()
        }

        var myalert : AlertDialog = alert.create()
        myalert.show()
    }
}