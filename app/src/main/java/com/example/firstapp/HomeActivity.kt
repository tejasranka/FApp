package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    lateinit var etHome: EditText

    var TAG = HomeActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setContentView(R.layout.activity_home) //layout inflater
        Log.i(TAG,"oncreate")
        etHome = findViewById<EditText>(R.id.etHome)
        etHome = findViewById<EditText>(R.id.etHome) //taking handle on the edittext that was inflated



}

override fun onStart() {
  super.onStart()
  Log.i(TAG,"onstart")

}

override fun onResume() {
  super.onResume()
  Log.i(TAG,"onresume -- restore the game state")

}

override fun onPause() {
  super.onPause()
  Log.i(TAG,"onpause --- store the game state")

}

override fun onStop() {
  super.onStop()
  Log.i(TAG,"onstop")

}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_home,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.firstoption -> { Toast.makeText(this,"first item selected",Toast.LENGTH_SHORT).show()}
            R.id.secondoption -> { Toast.makeText(this,"second item selected",Toast.LENGTH_SHORT).show()}

        }
        return true
    }


    fun sendResult(view: View) {
        var result = etHome.text.toString()
        var resIntent = Intent()
        resIntent.putExtra("resultkey",result)
        setResult(RESULT_OK,resIntent)
        finish()
    }
}

