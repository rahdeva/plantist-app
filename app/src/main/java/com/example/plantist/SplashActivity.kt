package com.example.plantist

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

//    val ivLogo: ImageView = findViewById(R.id.iv_logo)
//    val ivTitle: ImageView = findViewById(R.id.iv_title)

    private val splashScreen = 3000

    private lateinit var logoAnimation: Animation
    private lateinit var titleAnimation: Animation

    private lateinit var ivLogo: ImageView
    private lateinit var ivTitle: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation)
        titleAnimation = AnimationUtils.loadAnimation(this, R.anim.title_animation)

        ivLogo = findViewById(R.id.iv_logo)
        ivTitle = findViewById(R.id.iv_title)

        ivLogo.animation = logoAnimation
        ivTitle.animation = titleAnimation

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())

    }
}