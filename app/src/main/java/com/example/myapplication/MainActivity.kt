package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var show:Button
    lateinit var showDetail:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ShowContact(view:View){
        show = findViewById(R.id.show)
        showDetail = findViewById(R.id.showDetail)

        var detail = "example.gmail.com"
        showDetail.setText(detail)
    }
}