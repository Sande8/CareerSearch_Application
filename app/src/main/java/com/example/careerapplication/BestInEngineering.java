package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestInEngineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_in_engineering);
        Button btneng=(Button)findViewById(R.id.btnEnglogout);
        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(BestInEngineering.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }
}
