package com.neotricks.demosplashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        moveToNextSection()
    }

    // Move to next screen.
    private fun moveToNextSection(){
        // do what process you need to do while splash screen is in foreground
        // you can have api call, or simply decide which screen to go next using shared pref.
        // I am simple going to open next screen.
        val mainActIntent = Intent(this, MainActivity::class.java)
        startActivity(mainActIntent)
        finish() // finish splash screen
    }
}
