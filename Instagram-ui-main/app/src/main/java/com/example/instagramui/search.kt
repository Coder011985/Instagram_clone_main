package com.example.instagramui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class search : AppCompatActivity() {
    lateinit var imgHome:ImageView
    lateinit var imgProfile:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imgHome = findViewById(R.id.img_home)
        imgProfile = findViewById(R.id.img_profile)
    }

    override fun onStart() {
        super.onStart()
        imgHome.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        imgProfile.setOnClickListener {
            startActivity(Intent(this,profile::class.java))
        }
    }
}