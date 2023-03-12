package com.anshu.animationapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClickBtn = findViewById<Button>(R.id.ClickBtn)
        val roateBtn = findViewById<Button>(R.id.rotateBtn)
        val bounceBtn = findViewById<Button>(R.id.bounceBtn)
        val blinkBtn = findViewById<Button>(R.id.blinkBtn)
        val zoomBtn = findViewById<Button>(R.id.zoomBtn)


        ClickBtn.setOnClickListener {
            animateButton()
        }
        roateBtn.setOnClickListener {
            rotateButton()
        }
        bounceBtn.setOnClickListener {
            bounceButton()
        }
        zoomBtn.setOnClickListener {
            zoomButton()
        }
        blinkBtn.setOnClickListener {
            blinkButton()
        }
    }

    private fun blinkButton() {
        val animBlink = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
        val tvAnim = findViewById<TextView>(R.id.TvAnim)
        tvAnim.startAnimation(animBlink)
    }

    private fun zoomButton() {

        val animZoomIn = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in)
        val animZoomOut = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)

        val tvAnim = findViewById<TextView>(R.id.TvAnim)
        tvAnim.startAnimation(animZoomIn)
        tvAnim.startAnimation(animZoomOut)
    }

    private fun bounceButton() {
        val animBounce = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
        val tvAnim = findViewById<TextView>(R.id.TvAnim)
        tvAnim.startAnimation(animBounce)
    }


    private fun animateButton() {
        val animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
        val animFadeOut = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_out)

        val tvAnim = findViewById<TextView>(R.id.TvAnim)
        tvAnim.startAnimation(animFadeOut)
        tvAnim.startAnimation(animFadeIn)
    }

    private fun rotateButton() {
        val animRotate = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
        val tvAnim = findViewById<TextView>(R.id.TvAnim)
        tvAnim.startAnimation(animRotate)

    }

}