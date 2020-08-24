package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class EngineeringTest extends AppCompatActivity {

    private RadioButton cbE1, cbE2, cbE3, cbE4, cbE5, cbE6, cbE7, cbE8, cbE9, cbE10;
    private Button btnsbumitEtest;
    private static ArrayList<Integer> ints;
    private String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_test);
        ints=new ArrayList<>();
        String output="";
        cbE1=(RadioButton)findViewById(R.id.cbEngineer_Question1_C);
        cbE2=(RadioButton)findViewById(R.id.cbEngineer_Question2_C);
        cbE3=(RadioButton)findViewById(R.id.cbEngineer_Question3_A);
        cbE4=(RadioButton)findViewById(R.id.cbEngineer_Question4_C);
        cbE5=(RadioButton)findViewById(R.id.cbEngineer_Question5_C);
        cbE6=(RadioButton)findViewById(R.id.cbEngineer_Question6_C);
        cbE7=(RadioButton)findViewById(R.id.cbEngineer_Question7_A);
        cbE8=(RadioButton)findViewById(R.id.cbEngineer_Question8_B);
        cbE9=(RadioButton)findViewById(R.id.cbEngineer_Question9_A);
        cbE10=(RadioButton)findViewById(R.id.cbEngineer_Question10_A);
        btnsbumitEtest=(Button) findViewById(R.id.btnsubmitEngineering_test);

        btnsbumitEtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate();
            }
        });

    }

    public void Validate(){

        if(cbE1.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE2.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE3.isChecked()){
            ints.add(4);
        }else {

        }

        if(cbE4.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE5.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE6.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE7.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE8.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE9.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbE10.isChecked()){

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
        Intent myintent=new Intent(EngineeringTest.this,TestResults.class);
        myintent.putExtra("SCORE",output);
        myintent.putExtra("OUTCOME",results);
        myintent.putExtra("CAREER",category);
        startActivity(myintent);

    }


}
