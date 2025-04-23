package com.example.instagramui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var img_profile:ImageView
    lateinit var img_msg:ImageView
    lateinit var img_search:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        img_profile = findViewById(R.id.img_profile)
        img_msg = findViewById(R.id.img_msg)
        img_search = findViewById(R.id.img_search)
    }

    override fun onStart() {
        super.onStart()
        img_profile.setOnClickListener{
            var intent = Intent(this,profile::class.java)
            startActivity(intent)
        }

        img_msg.setOnClickListener{
            var intent = Intent(this,Messages::class.java)
            startActivity(intent)
        }

        img_search.setOnClickListener{
            var intent = Intent(this,search::class.java)
            startActivity(intent)
        }
    }
}