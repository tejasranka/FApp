package com.example.firstapp

import android.content.Intent
import android.content.SharedPreferences
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
    private var fileName = "bajaj_sharedprefs"
    private lateinit var sharedPreferences: SharedPreferences

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
    private fun restoreData() {
        //open the file
        sharedPreferences = getSharedPreferences(fileName, MODE_PRIVATE)
        //read from the file
        var data = sharedPreferences.getString("mkey","")
        //set the data into the edittext
        etHome.setText(data)
    }
    private fun saveData() {
        //get data from edittext
        var data = etHome.text.toString()
        //create file
        sharedPreferences = getSharedPreferences(fileName, MODE_WORLD_WRITEABLE)
        //open the file
        var editor = sharedPreferences.edit()
        //write to the file
        editor.putString("mkey",data)
        //save the file
        editor.apply()
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

