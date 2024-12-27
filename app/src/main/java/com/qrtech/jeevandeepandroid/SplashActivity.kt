package com.qrtech.jeevandeepandroid


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val splashScreenTime = 2000L // 2 seconds
        val mainIntent = Intent(this, MainActivity::class.java)
        window.decorView.postDelayed({
            startActivity(mainIntent)
            finish()
        }, splashScreenTime)
    }
}
