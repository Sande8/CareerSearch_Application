package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class SoftwareEngineeringTest extends AppCompatActivity {

    private Button btnSubmitSoftware_Test;
    private RadioGroup rgQuestion1,rgQuestion2,rgQuestion3,rgQuestion4,rgQuestion5;
    private RadioGroup rgQuestion6,rgQuestion7,rgQuestion8,rgQuestion9,rgQuestion10;

    private RadioButton cbQ1_A,cbQ1_B,cbQ1_C,cbQ1_D;
    private RadioButton cbQ2_A,cbQ2_B,cbQ2_C,cbQ2_D;
    private RadioButton cbQ3_A,cbQ3_B,cbQ3_C,cbQ3_D;
    private RadioButton cbQ4_A,cbQ4_B,cbQ4_C,cbQ4_D;
    private RadioButton cbQ5_A,cbQ5_B,cbQ5_C,cbQ5_D;
    private RadioButton cbQ6_A,cbQ6_B,cbQ6_C,cbQ6_D;
    private RadioButton cbQ7_A,cbQ7_B,cbQ7_C,cbQ7_D;
    private RadioButton cbQ8_A,cbQ8_B,cbQ8_C,cbQ8_D;
    private RadioButton cbQ9_A,cbQ9_B,cbQ9_C,cbQ9_D;
    private RadioButton cbQ10_A,cbQ10_B,cbQ10_C,cbQ10_D;

   private static ArrayList<Integer> ints;
    private String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_engineering_test);
        String output="";
        ints=new ArrayList<>();
        //initialising radio buttons for answers in software engineering test
        cbQ1_B=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question1_B);
        cbQ2_D=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question2_D);
        cbQ3_D=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question3_D);
        cbQ4_A=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question4_A);
        cbQ5_B=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question5_B);
        cbQ6_C=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question6_C);
        cbQ7_B=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question7_B);
        cbQ8_B=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question8_B);
        cbQ9_B=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question9_B);
        cbQ10_A=(RadioButton) findViewById(R.id.cbSoft_Engineer_Question10_A);

        btnSubmitSoftware_Test=(Button)findViewById(R.id.btnsubmitSoftware_test);
        btnSubmitSoftware_Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate();
            }
        });
    }

    public void Validate(){

        if(cbQ1_B.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ2_D.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ3_D.isChecked()){
            ints.add(4);
        }else {

        }

        if(cbQ4_A.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ5_B.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ6_C.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ7_B.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ8_B.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ9_B.isChecked()){

            ints.add(4);
        }else {

        }

        if(cbQ10_A.isChecked()){

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
        Intent myintent=new Intent(SoftwareEngineeringTest.this,TestResults.class);
        myintent.putExtra("SCORE",output);
        myintent.putExtra("OUTCOME",results);
        myintent.putExtra("CAREER",category);
        startActivity(myintent);



    }

}
