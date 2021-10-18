package com.example.imageviewsbonus

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        imageView=findViewById(R.id.imageView)

        button.setOnClickListener {
            imageView.setBackgroundResource(R.drawable.day)
        }

        button2.setOnClickListener {
            imageView.setBackgroundResource(R.drawable.night)
        }

    }
}