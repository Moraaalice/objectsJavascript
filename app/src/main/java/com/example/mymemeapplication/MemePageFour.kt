package com.example.mymemeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MemePageFour : AppCompatActivity() {
    lateinit var tvNext:Button
    lateinit var ivPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page_four)
        tvNext = findViewById(R.id.tvNext)
        tvNext.setOnClickListener {
            val intent = Intent(this,MemeLastPage::class.java)
            startActivity(intent)
    }
        ivPrevious = findViewById(R.id.ivPrevious)
        ivPrevious.setOnClickListener {
            val intent = Intent(this,MemePageThree::class.java)
            startActivity(intent)

}
    }
    }