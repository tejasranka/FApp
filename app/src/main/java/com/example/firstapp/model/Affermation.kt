package com.example.firstapp.model

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.R

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmations().size.toString()
    }
}