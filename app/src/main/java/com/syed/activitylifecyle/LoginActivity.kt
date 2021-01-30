package com.syed.activitylifecyle

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() /*View.OnClickListener*/  {
/*override fun onClick(v: View?) {
        Toast.makeText(this@LoginActivity, "Login Button not operational Yet", Toast.LENGTH_LONG)
            .show()
    }*/  // this is method 1

    lateinit var etemail: EditText
    lateinit var etpass: EditText
    lateinit var btnlogin: Button
    lateinit var txtforgotpass: TextView
    lateinit var txtregister: TextView
    val useridphone:String ="012345"
    val password=arrayOf("tony","widow","hulk","thor","wakanda","steve","clint")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
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
                        avenger = "Iron Man"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[1] -> {
                        avenger = "Black Widow"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[2] -> {
                        avenger = "The Incredible Hulk (Strongest avenger;))"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[3] -> {
                        avenger = "THOR(Point Break)"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[4] -> {
                        avenger = "Black Panther"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[5] -> {
                        avenger = "Captain America"
                        intent.putExtra("AvengerName", avenger)
                        startActivity(intent)
                    }
                    password[6] -> {
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

}