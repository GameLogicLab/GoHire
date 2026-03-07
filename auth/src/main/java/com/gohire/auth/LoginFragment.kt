package com.gohire.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin = view.findViewById<Button>(R.id.login_btn)

        btnLogin.setOnClickListener {
            val intent = Intent().apply {
                setClassName("com.gohire.app", "com.gohire.app.MainActivity")
            }
            startActivity(intent)
        }

        return view
    }
}