package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electrical extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical1);
        button1 = findViewById(R.id.electrical_button_electrical);
        button2 = findViewById(R.id.electrical_button_plumbing);
        button3 = findViewById(R.id.electrical_button_cleaning);
        button4 = findViewById(R.id.electrical_button_other);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openServices();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openServices();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openServices();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openServices();

            }
        });
    }
    public void openServices() {
        Intent intent = new Intent(this, services.class);
        startActivity(intent);
    }


}
