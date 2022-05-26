package dev.oure.bookpicture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto5Activity : AppCompatActivity() {
    lateinit var btnBack5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBack5=findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            intent= Intent(this,BookPhoto4Activity::class.java)
            startActivity(intent)
        }
    }
}