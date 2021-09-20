package com.example.color_my_views

import android.R.color.holo_green_light
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()


        }
    private fun setlisteners() {

       val clickableView:List<View> =
           listOf(boxOneTextt,boxTwoText,boxThreeText,boxFourText,boxFiveText,constraintLayout1)

        for(item in clickableView){
            item.setOnClickListener{makecolored(it)}
        }





    }
    private fun makecolored(view:View){
        when(view.id){
            R.id.boxOneTextt->view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText->view.setBackgroundColor(Color.GRAY)
            R.id.boxThreeText->view.setBackgroundColor(Color.BLUE)
            R.id.boxFourText->view.setBackgroundColor(Color.YELLOW)
            R.id.boxFiveText->view.setBackgroundColor(Color.CYAN)

            else ->view.setBackgroundColor(Color.LTGRAY)
        }
    }
}