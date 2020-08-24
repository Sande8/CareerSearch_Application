package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);
        TextView txtTestResults=(TextView)findViewById(R.id.txtTestResults);
        TextView txtoutcomes=(TextView) findViewById(R.id.txtTestPassed);
        TextView txtnote=(TextView) findViewById(R.id.txtNote);
        TextView txtUniversities=(TextView) findViewById(R.id.txtDecider);
        txtUniversities.setPaintFlags(txtUniversities.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        Bundle bundle=getIntent().getExtras();
        txtTestResults.setText(bundle.getString("SCORE"));

        Bundle bundle1=getIntent().getExtras();
        String testOutcomes=bundle1.getString("OUTCOME");

        Bundle categoryBundle=getIntent().getExtras();
        String category=categoryBundle.getString("CAREER");
        if(testOutcomes.equals("Passed")){
            txtoutcomes.setText("Test Passed");
            txtnote.setText("This means that you really need to consider taking the career under "+category+" "+"Category."+"\t"+
            "Click the link below, to see the best universities in "+category+".");
            txtUniversities.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //go to university page
                    if(category.equals("Accounting")){
                        Intent myintent= new Intent(TestResults.this,BestInAccounting.class);
                        startActivity(myintent);
                    }
                    if(category.equals("Education")){
                        Intent myintent= new Intent(TestResults.this,BestIEducation.class);
                        startActivity(myintent);
                    }
                    if(category.equals("Technology")){
                        Intent myintent= new Intent(TestResults.this,BestInTechnology.class);
                        startActivity(myintent);
                    }
                    if(category.equals("Health")){
                        Intent myintent= new Intent(TestResults.this,BestInHealth.class);
                        startActivity(myintent);
                    }
                    if(category.equals("Engineering")){
                        Intent myintent= new Intent(TestResults.this,BestInEngineering.class);
                        startActivity(myintent);
                    }
                }
            });
        }
        if(testOutcomes.equals("Failed")){
            txtoutcomes.setText("Test Failed");
            txtoutcomes.setTextColor(Color.parseColor("#FF0000"));
            txtnote.setText("It may happen that you did not select the personality traits that suite you the most."+"\t"+
                    "Don't wory though, we suggest that you click the link below so you can give us your personality traits and soft skills again."+""+
                    "Please be more careful this time, only take the personality traits and soft skills that describe you the most.");
            txtUniversities.setText("Take Personal Assessment Again");
            txtUniversities.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myintent=new Intent(TestResults.this,Assessment.class);

                    startActivity(myintent);
                }
            });
        }
    }
}
