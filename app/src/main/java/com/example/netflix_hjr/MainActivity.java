package com.example.netflix_hjr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (new Handler()).postDelayed(this::move, 2000);
    }
    public void move(){
        Intent login = new Intent(MainActivity.this, Login.class);
        login.putExtra("state","success");
        startActivity(login);
    }
}