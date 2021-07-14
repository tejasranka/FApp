package com.example.firstapp.model.todo;

import android.os.AsyncTask;

import com.example.firstapp.model.todo.TodoDao;
import com.example.firstapp.model.todo.TodoNote;

public  class insertTodonoteAsyncTask extends AsyncTask<TodoNote, Void, Void> {

    private TodoDao mAsyncTaskDao;

    insertTodonoteAsyncTask(TodoDao dao) {
        mAsyncTaskDao = dao;
    }

    @Override
    protected Void doInBackground(final TodoNote... params) {
        mAsyncTaskDao.insertNote(params[0]);
        return null;
    }
}