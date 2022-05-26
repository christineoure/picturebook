package dev.oure.bookpicture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookPhoto1Activity : AppCompatActivity() {
    lateinit var btnNext2:Button
    lateinit var btnBack1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_photo1)
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
           val intent= Intent(this,BookPhoto3Activity::class.java)
            startActivity(intent)
        }
        btnBack1=findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
    }
}
     }