package com.jose.roomdatabasejava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import com.jose.roomdatabasejava.Database.UserDatabase;

import androidx.room.Room;

public class DbAsyncTask extends AsyncTask<Void,Void,String> {

    public static UserDatabase userDatabase;
    private String userAdd;
    @SuppressLint("StaticFieldLeak")
    private Context contextMainactivity;
    DbAsyncTask(Context context, String userAdd){
        this.contextMainactivity=context;
        this.userAdd=userAdd;
    }

    @Override
    protected String doInBackground(Void... voids) {

       // userDatabase = Room.databaseBuilder(contextMainactivity,UserDatabase.class,"userDB").build();
        return userAdd;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
