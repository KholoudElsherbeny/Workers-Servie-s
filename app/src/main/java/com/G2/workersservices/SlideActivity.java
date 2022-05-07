package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SlideActivity extends AppCompatActivity {
    public static ViewPager viewPager;
    SlideViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        viewPager=findViewById(R.id.viewpager);
        adapter= new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
        getSupportActionBar().hide();
        if(sOpenedAlready())
        {
            Intent intent=new Intent(SlideActivity.this,MainActivity.class);
            intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }
        else{
            SharedPreferences.Editor editor=getSharedPreferences("slide",MODE_PRIVATE).edit();
            editor.putBoolean("slide",true);
            editor.commit();

        }
    }

    private boolean sOpenedAlready() {
        SharedPreferences sharedPreferences =getSharedPreferences("slide",MODE_PRIVATE);
        boolean result = sharedPreferences.getBoolean("slide",false);
        return result;
    }
}