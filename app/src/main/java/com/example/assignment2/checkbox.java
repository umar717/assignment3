package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
    CheckBox A1,A2,A3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        A1 = findViewById(R.id.Check1);
        A2 = findViewById(R.id.Check2);
        A3 = findViewById(R.id.Check3);
    }
    public void Getvalues(View v){
        StringBuilder builder = new StringBuilder();
        if (A1.isChecked()){
            String value1 = A1.getText().toString();
            builder.append(A1);
            Toast.makeText(this, "Option1", Toast.LENGTH_SHORT).show();
        }
        if (A2.isChecked()){String value1 = A2.getText().toString();
            builder.append("\n"+A2);
            Toast.makeText(this, "Option2", Toast.LENGTH_SHORT).show();

        }
        if (A3.isChecked()){
            String value1 = A3.getText().toString();
            builder.append("\n"+A3);
            Toast.makeText(this, "Option3", Toast.LENGTH_SHORT).show();

        }
        Toast.makeText(this,builder, Toast.LENGTH_SHORT).show();

    }
}