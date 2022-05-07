package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class plumbing1 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumbing1);
        button1 = findViewById(R.id.plumbing_button_sink);
        button2 = findViewById(R.id.plumbing_button_boiler);
        button3 = findViewById(R.id.plumbing_button_toilet);
        button4 = findViewById(R.id.plumbing_button_pumps);
        button5 = findViewById(R.id.plumbing_button_other);

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
        button5.setOnClickListener(new View.OnClickListener() {
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
