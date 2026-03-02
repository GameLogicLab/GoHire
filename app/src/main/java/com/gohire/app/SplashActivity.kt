package com.gohire.app

import android.content.Intent
import android.graphics.drawable.Animatable
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        val imageView = findViewById<ImageView>(R.id.splashLogo)

        val drawable = imageView.drawable
        if (drawable is Animatable) {
            drawable.start()
        }

        imageView.postDelayed({
            val intent = Intent(this, com.gohire.auth.AuthActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}