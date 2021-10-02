package com.example.plantist

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AboutAppActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgbtnBack : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        imgbtnBack = findViewById(R.id.imgbtn_back_about)
        imgbtnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val backaboutIntent = Intent(this,MainActivity::class.java)
        backaboutIntent.putExtra("flag", "1")
        startActivity(backaboutIntent)
    }
}