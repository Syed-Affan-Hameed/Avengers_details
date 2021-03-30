package com.syed.activitylifecyle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
     var titlename : String="xyz"
    lateinit var sharedpreferences:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedpreferences=getSharedPreferences(getString(R.string.preferences_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.actvity_scroll)
        println("The onCreate() is Called")
        titlename= sharedpreferences.getString("Title","The Avengers").toString()
        title= titlename
    }





}