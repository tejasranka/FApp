package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.simpleName
    lateinit var nameEditText: EditText   //declaration
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//show/inflate activity_main file
        nameEditText = findViewById(R.id.editTextTextPersonName) //instantiation, initialization
        textView = findViewById(R.id.resTextview)
        Log.i(TAG,"onCreate")
    }

    fun clickHandler(view: View) {
        Log.v(TAG,"clickHandler")

        // throw  NullPointerException()
        var homeIntent: Intent;
        homeIntent = Intent(this,HomeActivity::class.java)
        startActivityForResult(homeIntent,123)
        startActivity(intent)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 123 && resultCode == RESULT_OK) {
            var result = data?.getStringExtra("resultkey")
            Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
        }
    }
}