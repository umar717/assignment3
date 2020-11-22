package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Editview extends AppCompatActivity {
    TextView pv;
    EditText ed;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editview);
        pv = findViewById(R.id.c1);
        //pv.setText("New Value");
        String value = pv.getText().toString();

        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
        ed.setText("God is one");
        String vale = ed.getText().toString().trim();
    }

}