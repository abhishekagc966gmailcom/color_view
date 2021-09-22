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
           listOf(boxOneTextt,boxTwoText,boxThreeText,boxFourText,boxFiveText,constraintLayout1,redButton
           ,greenButton,yellowButton)

        for(item in clickableView){
            item.setOnClickListener{makecolored(it)}
        }





    }
    private fun makecolored(view:View){
        when(view.id){
            R.id.boxOneTextt->view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText->view.setBackgroundColor(Color.GRAY)
            R.id.boxThreeText->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.redButton->boxThreeText.setBackgroundResource(R.color.myRed)
            R.id.yellowButton->boxFourText.setBackgroundResource(R.color.myYellow)
            R.id.greenButton->boxFiveText.setBackgroundResource(R.color.myGreen)

            else ->view.setBackgroundColor(Color.LTGRAY)
        }
    }
}