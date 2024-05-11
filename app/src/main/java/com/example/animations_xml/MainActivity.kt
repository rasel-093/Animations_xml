package com.example.animations_xml

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var animatedTextView: TextView
    private lateinit var scaleBtn: Button
    private lateinit var rotateBtn: Button
    private lateinit var translateBtn: Button
    private lateinit var alphaBtn: Button
    private lateinit var stopAnimBtn: Button
    private lateinit var animation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Getting views id
        setContentView(R.layout.activity_main)
        animatedTextView = findViewById(R.id.animatedTv)
        scaleBtn = findViewById(R.id.scale_btn)
        rotateBtn = findViewById(R.id.rotate_btn)
        translateBtn = findViewById(R.id.translate_btn)
        alphaBtn = findViewById(R.id.alpha_btn)
        stopAnimBtn = findViewById(R.id.stop_animation_btn)

        //Setting click listeners
        scaleBtn.setOnClickListener {
//            val scaleAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            animatedTextView.startAnimation(animation)
        }
        rotateBtn.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.rotation)
            animatedTextView.startAnimation(animation)
        }
        translateBtn.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.translate)
            animatedTextView.startAnimation(animation)
        }
        alphaBtn.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
            animatedTextView.startAnimation(animation)
        }
        stopAnimBtn.setOnClickListener {
            animation.cancel()
            animatedTextView.clearAnimation()
        }
    }
}