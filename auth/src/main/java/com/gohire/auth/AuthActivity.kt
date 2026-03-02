    package com.gohire.auth
    
    import android.os.Bundle
    import android.widget.LinearLayout
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity

    class AuthActivity : AppCompatActivity(),TopFragment.OnButtonClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_auth)
            // Load Top Fragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentTop, TopFragment())
                .commit()
    
            // Default load Login
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentBottom, LoginFragment())
                .commit()


        }

        private fun animateLayoutChange() {
            val mainSection = findViewById<LinearLayout>(R.id.mainSection)
            val transition = android.transition.AutoTransition()
            transition.duration = 300
            android.transition.TransitionManager.beginDelayedTransition(mainSection, transition)
        }

        override fun onLoginClicked() {

            animateLayoutChange()

            supportFragmentManager.beginTransaction()
                .setCustomAnimations(
                    android.R.anim.slide_in_left,
                    android.R.anim.slide_out_right
                )
                .replace(R.id.fragmentBottom, LoginFragment())
                .commit()
        }

        override fun onSignupClicked() {

            animateLayoutChange()

            supportFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.slide_in_right,
                    R.anim.slide_out_left
                )
                .replace(R.id.fragmentBottom, SignupFragment())
                .commit()
        }
    }