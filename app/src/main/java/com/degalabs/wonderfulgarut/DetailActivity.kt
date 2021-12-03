package com.degalabs.wonderfulgarut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_RATING = "extra_rating"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgReceived: ImageView = findViewById(R.id.img_detail_photo)
        val nameReceived: TextView = findViewById(R.id.tv_detail_name)
        val descReceived: TextView = findViewById(R.id.tv_detail_desc)
        val locationReceived: TextView = findViewById(R.id.tv_detail_location)
        val ratingReceived: TextView = findViewById(R.id.tv_detail_rating)


        imgReceived.setImageResource(intent.getIntExtra(EXTRA_IMG, 0))
        nameReceived.text = intent.getStringExtra(EXTRA_NAME)
        descReceived.text = intent.getStringExtra(EXTRA_DESC)
        locationReceived.text = intent.getStringExtra(EXTRA_LOCATION)
        ratingReceived.text = intent.getStringExtra(EXTRA_RATING)
    }

}

