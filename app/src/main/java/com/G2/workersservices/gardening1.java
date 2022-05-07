package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gardening1 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardening1);
        button1 = findViewById(R.id.gardening_button_general);
        button2 = findViewById(R.id.gardening_button_gardens_maintenance_contracts);
        button3 = findViewById(R.id.gardening_button_other);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails();

            }
        });
    }
    public void openDetails() {
        Intent intent = new Intent(this, details.class);
        startActivity(intent);
    }
}