//package com.qrtech.jeevandeepandroid
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import android.widget.Button
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val video1Button: Button = findViewById(R.id.video1Button)
//        val video2Button: Button = findViewById(R.id.video2Button)
//
//        video1Button.setOnClickListener {
//            playVideo("https://flutter.github.io/assets-for-api-docs/assets/videos/butterfly.mp4")
//        }
//
//        video2Button.setOnClickListener {
//            playVideo("https://flutter.github.io/assets-for-api-docs/assets/videos/bee.mp4")
//        }
//    }
//
//    private fun playVideo(videoUrl: String) {
//        val intent = Intent(this, VideoPlayerActivity::class.java)
//        intent.putExtra("VIDEO_URL", videoUrl)
//        startActivity(intent)
//    }
//}

package com.qrtech.jeevandeepandroid

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video1Button: Button = findViewById(R.id.video1Button)
        val video2Button: Button = findViewById(R.id.video2Button)
        video1Button.setTextColor(Color.RED)
        video2Button.setTextColor(Color.RED)
        setupButtonFocus(video1Button)
        setupButtonFocus(video2Button)


        video1Button.setOnClickListener {
            playVideo("android.resource://com.qrtech.jeevandeepandroid/" + R.raw.video1)
        }

        video2Button.setOnClickListener {
            playVideo("android.resource://com.qrtech.jeevandeepandroid/" + R.raw.video2)
        }
    }

    private fun setupButtonFocus(button: Button) {
        button.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                button.setTextColor(Color.WHITE)
            } else {
                button.setTextColor(Color.RED)
            }
        }
    }

    private fun playVideo(videoUrl: String) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("VIDEO_URL", videoUrl)
        startActivity(intent)
    }
}

