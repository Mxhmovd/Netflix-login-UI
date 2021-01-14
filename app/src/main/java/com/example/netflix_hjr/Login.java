package com.example.netflix_hjr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle sent = getIntent().getExtras();
        String rec = sent.getString("state");
        Log.d("state",rec);

    }

}