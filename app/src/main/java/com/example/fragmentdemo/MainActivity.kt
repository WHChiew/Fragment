package com.example.fragmentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnTesting = findViewById<Button>(R.id.btnTesting)

        btnTesting.setOnClickListener(){
//            val contactNumber = Uri.parse("tel:01128963566")
//            var intent: Intent = Intent(Intent.ACTION_DIAL, contactNumber)
//            startActivity(intent)

//            val geo = Uri.parse("geo: 3.1466, 101.6958")
//            var intent: Intent = Intent(Intent.ACTION_VIEW, geo)
//            startActivity(intent)

//            val geo = Uri.parse("geo: 3.1466, 101.6958")
//            var intent: Intent = Intent(Intent.ACTION_SENDTO)
//            intent.data = Uri.parse("mailto:abc@gmail.com")
//            intent.putExtra(Intent.EXTRA_SUBJECT, "smlj")
//            intent.putExtra(Intent.EXTRA_TEXT, "hello")
//
//            startActivity(intent)

var intent: Intent = Intent(this, TestingActivity::class.java)
            intent.putExtra("personName", "Ali")

        }
    }
}