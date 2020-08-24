package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestInAccounting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_in_accounting);
        Button btnacc=(Button)findViewById(R.id.btnAcclogout);
        btnacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(BestInAccounting.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }
}
