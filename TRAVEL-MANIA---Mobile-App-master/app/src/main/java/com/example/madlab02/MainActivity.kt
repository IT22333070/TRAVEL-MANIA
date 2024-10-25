package com.example.madlab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btnsignup = findViewById<Button>(R.id.btnsignup)
            btnsignup.setOnClickListener {
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)}

        val btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)}



        }


        }




