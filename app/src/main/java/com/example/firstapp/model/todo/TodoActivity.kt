package com.example.firstapp.model.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.firstapp.model.todo.TodoDao
import com.example.firstapp.model.todo.TodoNote
import com.example.firstapp.model.todo.TodoRoomDb
import com.example.firstapp.R

class TodoActivity : AppCompatActivity() {

    lateinit var database: TodoRoomDb
    lateinit var todoDao: TodoDao
    lateinit var etTitle: EditText
    lateinit var etDescription: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        etTitle = findViewById(R.id.etTitle)
        etDescription = findViewById(R.id.etDescription)
        database = TodoRoomDb.getDatabase(this)
        todoDao = database.todoDao()
    }

    fun dbHandler(view: View) {
        //get the data from edittexts
        var title = etTitle.text.toString()
        var description = etDescription.text.toString()
        //create a todonote
        var todoNote = TodoNote(title,description)
        //insert data using dao
        //todoDao.insertNote(todoNote)
        insert(todoDao,todoNote)
    }

    fun insert(todoDao: TodoDao, todoNote: TodoNote) {
        var insertTask = insertTodonoteAsyncTask(todoDao).execute(todoNote)
        etTitle.setText("")
        etDescription.setText("")
    }
}