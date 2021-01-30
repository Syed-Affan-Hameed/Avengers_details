package com.syed.activitylifecyle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() /*View.OnClickListener*/ {
/*override fun onClick(v: View?) {
        Toast.makeText(this@LoginActivity, "Login Button not operational Yet", Toast.LENGTH_LONG)
            .show()
    }*/  // this is method 1

    lateinit var etemail: EditText
    lateinit var etpass: EditText
    lateinit var btnlogin: Button
    lateinit var txtforgotpass: TextView
    lateinit var txtregister: TextView
    val useridphone: String = "012345"
    val password = arrayOf("tony", "widow", "hulk", "thor", "wakanda", "steve", "clint")
    lateinit var sharedpreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedpreferences =
            getSharedPreferences(getString(R.string.preferences_file_name), Context.MODE_PRIVATE)
        val isLoggedIn = sharedpreferences.getBoolean("isLoggedIn", false)
        if (isLoggedIn) {
            intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        } else {
            setContentView(R.layout.activity_login)
        }
        title = "Login"
        etemail = findViewById(R.id.etemail)
        etpass = findViewById(R.id.etpass)
        btnlogin = findViewById(R.id.btnlogin)
        txtforgotpass = findViewById(R.id.txtforgotpass)
        txtregister = findViewById(R.id.txtregister)


        btnlogin.setOnClickListener {
            val user = etemail.text.toString()
            val pass = etpass.text.toString()
            lateinit var avenger: String
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            if (user == useridphone) {
                when (pass) {
                    password[0] -> {
                        savepreferences()
                        avenger = "Iron Man"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[1] -> {
                        savepreferences()
                        avenger = "Black Widow"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[2] -> {
                        savepreferences()
                        avenger = "The Incredible Hulk (Strongest avenger;))"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[3] -> {
                        savepreferences()
                        avenger = "THOR(Point Break)"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[4] -> {
                        savepreferences()
                        avenger = "Black Panther"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[5] -> {
                        savepreferences()
                        avenger = "Captain America"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[6] -> {
                        savepreferences()
                        avenger = "Hawk Eye"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    else -> {
                        Toast.makeText(
                            this@LoginActivity,
                            "Incorrect Credentials",
                            Toast.LENGTH_SHORT
                        ).show() // Method 2 this is the Lamda representation}
                    }
                }

            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savepreferences() {
        sharedpreferences.edit().putBoolean("isLoggedIn", true).apply()
    }

}