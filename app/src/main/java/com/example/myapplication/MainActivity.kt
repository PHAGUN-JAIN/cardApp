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

    fun showContact(view:View){
        show = findViewById(R.id.show)
        showDetail = findViewById(R.id.showDetail)

        val detail = "example.gmail.com"
        if(showDetail.text.length=== 0){
            showDetail.setText(detail)
        }else{
            showDetail.setText("")
        }
    }
}