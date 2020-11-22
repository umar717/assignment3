package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class toggle extends AppCompatActivity {
    ToggleButton cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
    }

    public void ToggleChecked(View v){
        cr = findViewById(R.id.toggle);
        if(cr.isChecked()){
            Toast.makeText(this, "Button on", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Button off", Toast.LENGTH_SHORT).show();
        }

    }
}