package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment1.MainActivity;

public class Splashscreen extends AppCompatActivity {
    private static final int DELAY_MILLIS = 3000;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this, MainActivity.class));
                finish();
            }
        },  DELAY_MILLIS);
    }
}
