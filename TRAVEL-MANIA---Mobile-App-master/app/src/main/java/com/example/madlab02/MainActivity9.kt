package com.example.madlab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val imgback1 = findViewById<ImageView>(R.id.imgback1)
        imgback1.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)}

        val btnbook = findViewById<Button>(R.id.btnbook)
        btnbook.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)}

    }
}