package com.jose.roomdatabasejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static UserDatabase userDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userDatabase = Room.databaseBuilder(getApplicationContext(),UserDatabase.class,"userDb").allowMainThreadQueries().build();

    }
}
