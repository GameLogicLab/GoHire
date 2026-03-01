package com.gohire.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(),TopFragment.OnButtonClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Load Top Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentTop, TopFragment())
            .commit()

        // Default load Login
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentBottom, LoginFragment())
            .commit()
    }

    override fun onLoginClicked() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentBottom, LoginFragment())
            .commit()
    }

    override fun onSignupClicked() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentBottom, SignupFragment())
            .commit()
    }
}