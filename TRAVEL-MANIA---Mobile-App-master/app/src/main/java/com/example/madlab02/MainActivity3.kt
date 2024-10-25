package com.example.madlab02
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imgcart = findViewById<ImageView>(R.id.imgcart)
        imgcart.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)}

            val imglocation = findViewById<ImageView>(R.id.imglocation)
            imglocation.setOnClickListener {
                val intent = Intent(this,MainActivity7::class.java)
                startActivity(intent)}

                val imgprofile = findViewById<ImageView>(R.id.imgprofile)
                imgprofile.setOnClickListener {
                    val intent = Intent(this,MainActivity8::class.java)
                    startActivity(intent)}

                    val imgfav = findViewById<ImageView>(R.id.imgfav)
                    imgfav.setOnClickListener {
                        val intent = Intent(this,MainActivity9::class.java)
                        startActivity(intent)}

                        val imgjapan = findViewById<ImageView>(R.id.imgjapan)
                        imgjapan.setOnClickListener {
                            val intent = Intent(this,MainActivity4::class.java)
                            startActivity(intent)}
                        }
                    }





