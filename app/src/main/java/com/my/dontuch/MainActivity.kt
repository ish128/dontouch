package com.my.dontuch

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val donTouchButton = findViewById<Button>(R.id.don_touch_button)
        val callButton = findViewById<ImageView>(R.id.call_image)

        donTouchButton.setOnClickListener {
          val soundFile =  MediaPlayer.create(this, R.raw.dontouch)
            soundFile.start()
        }

        callButton.setOnClickListener{
           val intentVal = Intent(Intent.ACTION_DIAL)
            intentVal.data = Uri.parse("tel:01045062937")
            startActivity(intentVal)
        }
    }
}