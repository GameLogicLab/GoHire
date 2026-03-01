package com.gohire.auth

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TopFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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

        btnLogin.setOnClickListener {
            listener?.onLoginClicked()
        }

        btnSignup.setOnClickListener {
            listener?.onSignupClicked()
        }

        return view
    }
}