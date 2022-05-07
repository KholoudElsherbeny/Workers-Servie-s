package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carpentry1 extends AppCompatActivity {
    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpentry1);
        setContentView(R.layout.activity_carpentry1);
        button1 = findViewById(R.id.carpentry_button_fabrication);
        button2 = findViewById(R.id.carpentry_button_other);

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
    }
    public void openServices() {
        Intent intent = new Intent(this, services.class);
        startActivity(intent);
    }


}
