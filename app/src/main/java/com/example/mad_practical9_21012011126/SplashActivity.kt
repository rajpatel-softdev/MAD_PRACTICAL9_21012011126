package com.example.mad_practical9_21012011126

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.ImageView
import android.view.animation.AnimationUtils

class SplashActivity : AppCompatActivity(), AnimationListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val av : ImageView = findViewById(R.id.image)
        val anim = av.drawable as AnimationDrawable
        anim.start()

        val anim2 = AnimationUtils.loadAnimation(this,R.anim.logo_animation)
        anim2.setAnimationListener(this)
        av.startAnimation(anim2)
    }
    override fun onAnimationStart(animation: Animation?) {}
    override fun onAnimationEnd(animation: Animation?) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    override fun onAnimationRepeat(animation: Animation?) {}
}