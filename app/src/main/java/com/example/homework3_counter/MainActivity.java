package com.example.homework3_counter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView Number;
    Button Inc, Reset;
    int Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number = (TextView) findViewById(R.id.NumText);
        Inc = (Button) findViewById(R.id.IncID);
        Reset =(Button) findViewById(R.id.Reset);

        Inc.setOnClickListener(v -> {
            Count++;
            Number.setText(String.valueOf(Count));
        });
        Reset.setOnClickListener(v -> {
            Count = 0;
            Number.setText(String.valueOf(Count));
        });

    }
}