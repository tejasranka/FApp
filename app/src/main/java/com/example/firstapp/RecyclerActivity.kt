package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.adapter.ItemAdapter
import com.example.firstapp.data.Datasource
class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmations().size.toString()
        /*val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmations().size.toString()*/

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(findViewById(R.id.recyclerView))
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}