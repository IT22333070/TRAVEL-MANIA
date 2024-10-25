package com.example.madlab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

            val imgback3 = findViewById<ImageView>(R.id.imgback3)
            imgback3.setOnClickListener {
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)}

                val btnp = findViewById<Button>(R.id.btnp)
                btnp.setOnClickListener {
                    val intent = Intent(this,MainActivity6::class.java)
                    startActivity(intent)
            }
        }
    }
