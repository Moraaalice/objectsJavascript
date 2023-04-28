package com.example.mymemeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MemeLastPage : AppCompatActivity() {
    lateinit var ivPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_last_page)
        ivPrevious.setOnClickListener {
            val intent = Intent(this,MemePageFour::class.java)
            startActivity(intent)
        }
    }
}