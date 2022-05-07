package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {
    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mHandler=new Handler();
        mRunnable= new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this,SlideActivity.class);
                startActivity(intent);
                finish();
            }
        };
        mHandler.postDelayed(mRunnable,1500);
        getSupportActionBar().hide();

    }
}
