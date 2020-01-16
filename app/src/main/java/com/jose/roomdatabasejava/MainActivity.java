package com.jose.roomdatabasejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.jose.roomdatabasejava.Model.CustomViewModel;

public class MainActivity extends AppCompatActivity {

    public static CustomViewModel customViewModel;
    String userAdd = "User added to Database";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customViewModel = new ViewModelProvider(this).get(CustomViewModel.class);
    }


}
