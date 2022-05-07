package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish extends AppCompatActivity {
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        button1 =findViewById(R.id.finish_button_home);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHome();
            }
        });
    }
    public void openHome(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}