package dev.oure.bookpicture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto4Activity : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btnBack3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo4)
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,BookPhoto5Activity::class.java)
            startActivity(intent)
        }
        btnBack3=findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent= Intent(this,BookPhoto3Activity::class.java)
            startActivity(intent)
        }
    }
}