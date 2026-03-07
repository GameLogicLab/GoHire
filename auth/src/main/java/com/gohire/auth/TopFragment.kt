package com.gohire.auth

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class TopFragment : Fragment() {

    interface OnButtonClickListener {
        fun onLoginClicked()
        fun onSignupClicked()
    }

    private var listener: OnButtonClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClickListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_top, container, false)

        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val btnSignup = view.findViewById<Button>(R.id.btnSignup)
        btnLogin.isSelected = true

        btnLogin.setOnClickListener {
            btnLogin.isSelected = true
            btnSignup.isSelected = false
            listener?.onLoginClicked()

            btnLogin.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(100)
                .withEndAction {
                    btnLogin.animate().scaleX(1f).scaleY(1f).duration = 100
                }
        }

        btnSignup.setOnClickListener {
            btnSignup.isSelected = true
            btnLogin.isSelected = false
            listener?.onSignupClicked()

            btnSignup.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(100)
                .withEndAction {
                    btnSignup   .animate().scaleX(1f).scaleY(1f).duration = 100
                }
        }

        return view
    }
}