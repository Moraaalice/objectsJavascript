package com.example.mymemeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MemePageTwo : AppCompatActivity() {
    lateinit var tvNext: Button
    lateinit var ivprevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page_two)
        tvNext = findViewById(R.id.tvNext)
        tvNext.setOnClickListener {
            val intent = Intent(this,MemePageThree::class.java)
            startActivity(intent)
    }
        ivprevious = findViewById(R.id.ivPrevious)
        ivprevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
}
 }
    }