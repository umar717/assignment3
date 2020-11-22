package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PublicKey;

public class Radiobutton extends AppCompatActivity {
    RadioGroup Rg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
    }

    public void ShowGender(View v){

        Rg = findViewById(R.id.genderGroup);
        int SelectedID = Rg.getCheckedRadioButtonId();
        String value = btn.getText().toString();
        Toast.makeText(this,value, Toast.LENGTH_SHORT).show();

    }

}