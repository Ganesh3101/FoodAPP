package com.bigapp.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.size
import com.synnapps.carouselview.CarouselView

class CarousalPage : AppCompatActivity() {

    var carousalimages = intArrayOf(
        R.drawable.dubai,
        R.drawable.moscow,
        R.drawable.paris,
        R.drawable.uk
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousal_page)
        val carouselview : CarouselView = findViewById(R.id.carouselmain)

        carouselview.pageCount =carousalimages.size


        
        carouselview.setImageListener { position, imageView ->
            imageView.setImageResource(carousalimages[position])
        }
    }
}