package com.example.mad_practical9_21012011126
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var animAlarm: AnimationDrawable
    lateinit var animHeart: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val intent= Intent(this, SplashActivity::class.java).also{
            startActivity(intent)
        }
        setContentView(R.layout.activity_main)

        val alaramIv: ImageView = findViewById(R.id.imageView)
        animAlarm = alaramIv.drawable as AnimationDrawable
        animAlarm.start()

        val heartsIv: ImageView = findViewById(R.id.imageView2)
        animHeart = heartsIv.drawable as AnimationDrawable
        animHeart.start()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            animAlarm.start()
            animHeart.start()
        } else {
            animAlarm.stop()
            animHeart.stop()
        }
    }
}