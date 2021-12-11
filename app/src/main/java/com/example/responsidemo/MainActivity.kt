package com.example.responsidemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        tvWelcome.setText(Html.fromHtml("<p>Halo! <b>Luky Setiawan</b></p>"))

        val btnIntent1 = findViewById<Button>(R.id.button_intent1)
        btnIntent1.setOnClickListener(){
            val intent1 = Intent(this, SecondActivity::class.java)
            startActivity(intent1)
        }

        val btnIntent2 = findViewById<Button>(R.id.button_intent2)
        btnIntent2.setOnClickListener(){
            val intent2 = Intent(this, ThirdActivity::class.java)
            startActivity(intent2)
        }
    }
}