package dev.oure.bookpicture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto3Activity : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnBack2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo3)
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent= Intent(this,BookPhoto4Activity::class.java)
            startActivity(intent)
        }
        btnBack2=findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,BookPhoto1Activity::class.java)
            startActivity(intent)
        }
    }
}