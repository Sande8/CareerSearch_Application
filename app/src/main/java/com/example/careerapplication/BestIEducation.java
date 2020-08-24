package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BestIEducation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_i_education);
        Button btnedu=(Button)findViewById(R.id.btnEdulogout);
        btnedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(BestIEducation.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }
}
