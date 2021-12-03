package com.degalabs.wonderfulgarut

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        actionBar?.setDisplayHomeAsUpEnabled(true)

        val github: Button= findViewById(R.id.tv_github)
        github.setOnClickListener(this)

        val instagram: Button = findViewById(R.id.tv_instagram)
        instagram.setOnClickListener(this)

        val linkedin: Button = findViewById(R.id.tv_linkedin)
        linkedin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_github -> {
                val url = "https://github.com/degalih"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            R.id.tv_instagram -> {
                val url = "https://www.instagram.com/galihmramdan17/"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            R.id.tv_linkedin -> {
                val url = "https://www.linkedin.com/in/galih-muhammad-ramdan-a71387142/"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
    }
}