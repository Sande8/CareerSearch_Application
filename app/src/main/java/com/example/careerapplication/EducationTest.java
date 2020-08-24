package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class EducationTest extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10;
    private Button btnSubmitEducation;
    private String output;
    private static ArrayList<Integer> ints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_test);
        ints=new ArrayList<>();
        String output="";

        rb1=(RadioButton) findViewById(R.id.cbEducation_Question1_A);
        rb2=(RadioButton) findViewById(R.id.cbEducation_Question2_B);
        rb3=(RadioButton) findViewById(R.id.cbEducation_Question3_C);
        rb4=(RadioButton) findViewById(R.id.cbEducation_Question4_C);
        rb5=(RadioButton) findViewById(R.id.cbEducation_Question5_B);
        rb6=(RadioButton) findViewById(R.id.cbEducation_Question6_C);
        rb7=(RadioButton) findViewById(R.id.cbEducation_Question7_B);
        rb8=(RadioButton) findViewById(R.id.cbEducation_Question8_A);
        rb9=(RadioButton) findViewById(R.id.cbEducation_Question9_D);
        rb10=(RadioButton) findViewById(R.id.cbEducation_Question10_A);

        btnSubmitEducation=(Button)findViewById(R.id.btnsubmitEducation_test);
        btnSubmitEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Validate();
            }
        });
    }

    public void Validate(){

        if(rb1.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb2.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb3.isChecked()){
            ints.add(4);
        }else {

        }

        if(rb4.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb5.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb6.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb7.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb8.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb9.isChecked()){

            ints.add(4);
        }else {

        }

        if(rb10.isChecked()){

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
        Intent myintent=new Intent(EducationTest.this,TestResults.class);
        myintent.putExtra("SCORE",output);
        myintent.putExtra("OUTCOME",results);
        myintent.putExtra("CAREER",category);
        startActivity(myintent);


    }
}
