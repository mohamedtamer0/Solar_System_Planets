package com.example.solarsystemplanets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_planet_details.*

class PlanetDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_details)



        var intent = intent
        val aTitle = intent.getStringExtra("Title")
        val aDes = intent.getStringExtra("Des")
        val aImage = intent.getIntExtra("Image", 0)

        a_title.text = aTitle
        a_Des.text = aDes
        a_image.setImageResource(aImage)



    }
}