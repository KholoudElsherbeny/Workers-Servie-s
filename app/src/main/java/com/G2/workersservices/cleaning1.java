package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cleaning1 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning1);
        button1 = findViewById(R.id.cleaning_button_deep_cleaning);
        button2 = findViewById(R.id.cleaning_button_standard_cleaning);
        button3 = findViewById(R.id.cleaning_button_furniture);
        button4 = findViewById(R.id.cleaning_button_facade);
        button5 = findViewById(R.id.cleaning_button_waterTank);
        button6 = findViewById(R.id.cleaning_button_other);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openDetails();

            }
        });
    }
    public void openDetails() {
        Intent intent = new Intent(this, details.class);
        startActivity(intent);
    }


}
