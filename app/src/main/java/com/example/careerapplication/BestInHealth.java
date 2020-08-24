package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestInHealth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_in_health);
        Button btnhealt=(Button)findViewById(R.id.btnhealthlogout);
        btnhealt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(BestInHealth.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }
}
