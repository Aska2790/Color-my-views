package com.aska.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aska.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //region Properties

    private lateinit var binding: ActivityMainBinding

    //endregion

    //region Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeListeners()
    }

    //endregion

    //region Initialization

    private fun initializeListeners(){
        with(binding){

            parent.setOnClickListener {
                it.setBackgroundResource(android.R.color.background_light)
                val color = R.color.white
                boxOneTextView.setBackgroundResource(color)
                boxTwoTextView.setBackgroundResource(color)
                boxThreeTextView.setBackgroundResource(color)
                boxFourTextView.setBackgroundResource(color)
                boxFiveTextView.setBackgroundResource(color)
                firstButton.setBackgroundResource(color)
                secondButton.setBackgroundResource(color)
                thirdButton.setBackgroundResource(color)
            }

            boxOneTextView.setOnClickListener {
                it.setBackgroundResource(android.R.color.darker_gray)
            }

            boxTwoTextView.setOnClickListener {
                it.setBackgroundResource(android.R.color.darker_gray)
            }

            boxThreeTextView.setOnClickListener {
                it.setBackgroundResource(R.color.yellow)
            }

            boxFourTextView.setOnClickListener {
                it.setBackgroundResource(R.color.red)
            }

            boxFiveTextView.setOnClickListener {
                it.setBackgroundResource(R.color.green)
            }

            firstButton.setOnClickListener {
                it.setBackgroundResource(R.color.yellow)
            }
            secondButton.setOnClickListener {
                it.setBackgroundResource(R.color.red)
            }
            thirdButton.setOnClickListener {
                it.setBackgroundColor(resources.getColor(R.color.green))
            }
        }
    }

    //endregion
}