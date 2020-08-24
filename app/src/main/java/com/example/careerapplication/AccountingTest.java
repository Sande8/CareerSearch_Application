package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class AccountingTest extends AppCompatActivity {

    private RadioButton ar1,ar2,ar3,ar4,ar5,ar6,ar7,ar8,ar9,ar10;
    private Button btnsubmitAccountingtest;
    private static ArrayList<Integer> ints;
    private String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting_test);
        ints=new ArrayList<>();
        String output="";
        ar1=(RadioButton)findViewById(R.id.cbAccounting_Question1_B);
        ar2=(RadioButton)findViewById(R.id.cbAccounting_Question2_B);
        ar3=(RadioButton)findViewById(R.id.cbAccounting_Question3_B);
        ar4=(RadioButton)findViewById(R.id.cbAccounting_Question4_D);
        ar5=(RadioButton)findViewById(R.id.cbAccounting_Question5_D);
        ar6=(RadioButton)findViewById(R.id.cbAccounting_Question6_B);
        ar7=(RadioButton)findViewById(R.id.cbAccounting_Question7_A);
        ar8=(RadioButton)findViewById(R.id.cbAccounting_Question8_D);
        ar9=(RadioButton)findViewById(R.id.cbAccounting_Question9_B);
        ar10=(RadioButton)findViewById(R.id.cbAccounting_Question10_C);
        btnsubmitAccountingtest=(Button) findViewById(R.id.btnsubmitAccounting_test);

        btnsubmitAccountingtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate();
            }
        });
    }

    public void Validate(){

        if(ar1.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar2.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar3.isChecked()){
            ints.add(4);
        }else {

        }

        if(ar4.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar5.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar6.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar7.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar8.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar9.isChecked()){

            ints.add(4);
        }else {

        }

        if(ar10.isChecked()){

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
        Intent myintent=new Intent(AccountingTest.this,TestResults.class);
        myintent.putExtra("SCORE",output);
        myintent.putExtra("OUTCOME",results);
        myintent.putExtra("CAREER",category);
        startActivity(myintent);


    }


}
