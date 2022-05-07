package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.A1_button_electrical);
        button2 = findViewById(R.id.A1_button_plumbing);
        button3 = findViewById(R.id.A1_button_cleaning);
        button4 = findViewById(R.id.A1_button_carpentry);
        button5 = findViewById(R.id.A1_button_gardening);
        button6 = findViewById(R.id.A1_button_satallite);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openElectrical();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlumbing();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCleaning();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCarpentry();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGardening();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSatallite();
            }
        });
    }
    public void openElectrical(){
        Intent intent = new Intent(this, Electrical.class);
        startActivity(intent);

    }
    public void openPlumbing(){
        Intent intent= new Intent(this, plumbing1.class);
        startActivity(intent);
    }
    public void openCleaning(){
        Intent intent= new Intent(this, cleaning1.class);
        startActivity(intent);
    }
    public void openCarpentry(){
        Intent intent= new Intent(this, carpentry1.class);
        startActivity(intent);
    }
    public void openGardening(){
        Intent intent= new Intent(this, gardening1.class);
        startActivity(intent);
    }
    public void openSatallite(){
        Intent intent= new Intent(this, satallite1.class);
        startActivity(intent);
    }
}
