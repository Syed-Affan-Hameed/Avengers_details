package com.syed.activitylifecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
     var titlename : String="xyz"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_scroll)
        println("The onCreate() is Called")
        if(intent!=null){
             titlename= intent.getStringExtra("AvengerName").toString()
        }
        title= titlename
    }





}