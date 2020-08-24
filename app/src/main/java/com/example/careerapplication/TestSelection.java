package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class TestSelection extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_selection);
        Button btnselection=(Button) findViewById(R.id.btnSubmitSelection);
        Spinner careerSpinner=(Spinner) findViewById(R.id.spinnerSelection);
        /*ArrayAdapter<String>AdaptCareers=new ArrayAdapter<String>(TestSelection.this,
                R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.Careers));
        AdaptCareers.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        careerSpinner.setAdapter(AdaptCareers);*/

       ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.Careers,R.layout.support_simple_spinner_dropdown_item);
       careerSpinner.setAdapter(adapter);
       careerSpinner.setOnItemSelectedListener(this);
        btnselection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selectedCareer=careerSpinner.getSelectedItem().toString();
                if(selectedCareer.equals("Education Careers")){
                    Intent myintent= new Intent(TestSelection.this,EducationTest.class);
                    startActivity(myintent);
                }



                if(selectedCareer.equals("Health Science Careers")){
                    Intent myintent= new Intent(TestSelection.this,HealthScienceTest.class);
                    startActivity(myintent);
                }
                if(selectedCareer.equals("Technology Careers")){
                    Intent myintent= new Intent(TestSelection.this,SoftwareEngineeringTest.class);
                    startActivity(myintent);
                }

                if(selectedCareer.equals("Accounting Careers")){
                    Intent myintent= new Intent(TestSelection.this,AccountingTest.class);
                    startActivity(myintent);

                }
                if(selectedCareer.equals("Engineering Careers")){
                    Intent myintent= new Intent(TestSelection.this,EngineeringTest.class);
                    startActivity(myintent);
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
