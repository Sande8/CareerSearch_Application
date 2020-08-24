package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class HealthScienceTest extends AppCompatActivity {

    private RadioButton hr1,hr2,hr3,hr4,hr5,hr6,hr7,hr8,hr9,hr10;
    private Button btnhealthsubmit_test;
    private static ArrayList<Integer> ints;
    private String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_science_test);
        ints=new ArrayList<>();
        String output="";
        hr1=(RadioButton) findViewById(R.id.cbHealth_Question1_C);
        hr2=(RadioButton) findViewById(R.id.cbHealth_Question2_B);
        hr3=(RadioButton) findViewById(R.id.cbHealth_Question3_D);
        hr4=(RadioButton) findViewById(R.id.cbHealth_Question4_A);
        hr5=(RadioButton) findViewById(R.id.cbHealth_Question5_C);
        hr6=(RadioButton) findViewById(R.id.cbHealth_Question6_A);
        hr7=(RadioButton) findViewById(R.id.cbHealth_Question7_D);
        hr8=(RadioButton) findViewById(R.id.cbHealth_Question8_A);
        hr9=(RadioButton) findViewById(R.id.cbHealth_Question9_C);
        hr10=(RadioButton) findViewById(R.id.cbHealth_Question10_A);

        btnhealthsubmit_test=(Button)findViewById(R.id.btnsubmitHealthscience_test);
        btnhealthsubmit_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate();
            }
        });
    }

    public void Validate(){

        if(hr1.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr2.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr3.isChecked()){
            ints.add(4);
        }else {

        }

        if(hr4.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr5.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr6.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr7.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr8.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr9.isChecked()){

            ints.add(4);
        }else {

        }

        if(hr10.isChecked()){

            ints.add(4);
        }else {

        }

        double sum=0;
        double percentage=0.00;
        for (int i=0;i<ints.size();i++){
            sum +=ints.get(i);
        }

        String results="";
        String category="";
        Bundle bundle=getIntent().getExtras();
        category=bundle.getString("CATEGORY");
        percentage=(sum/40)*100;
        if(percentage>=50){
            results="Passed";
        }

        if(percentage<=50){
            results="Failed";

        }
        output="Marks :"+(int) Math.round(sum)+"/40"+"\n"+"You got "+":"+(double)Math.round(percentage*100.0)/100+"%";
        Intent myintent=new Intent(HealthScienceTest.this,TestResults.class);
        myintent.putExtra("SCORE",output);
        myintent.putExtra("OUTCOME",results);
        myintent.putExtra("CAREER",category);
        startActivity(myintent);


    }

}
