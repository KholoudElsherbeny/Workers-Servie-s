package com.G2.workersservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class personalData1 extends AppCompatActivity {
    private Spinner spinner;
    private Button button1;
    private EditText name ,phone , address ;
    TextView textView;
    FirebaseDatabase root;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data1);
        button1 = findViewById(R.id.personal_data_button_Submit);
        name = findViewById(R.id.enter_your_name);
        phone = findViewById(R.id.enter_your_date);
        address = findViewById(R.id.enter_your_address);
        spinner= findViewById(R.id.spinner);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openFinish();

                root = FirebaseDatabase.getInstance();
                reference = root.getReference("Customers Details");
                String Name = name.getText().toString();
                String Phone = phone.getText().toString();
                String Address = address.getText().toString();


                UserHelperClass2 helperClass2 = new UserHelperClass2(Name ,Phone ,Address );

                reference.child(Phone).setValue(helperClass2);



            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.color_spinner,
                getResources().getStringArray(R.array.govern)
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedItem = spinner.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    public void openFinish() {
        Intent intent = new Intent(this, finish.class);
        startActivity(intent);
    }

}