package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultsActivity extends AppCompatActivity {

    ArrayList<Career> careers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        careers=new ArrayList<>();
        TextView txtResults=(TextView)findViewById(R.id.txtResults);
        txtResults.setPaintFlags(txtResults.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        Bundle bundle=getIntent().getExtras();
       txtResults.setText(bundle.getString("RESULTS"));
        String getResults=bundle.getString("RESULTS");
       txtResults.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(getResults.equals("Engineering Category")){
                   //take go to angineering test
                   Intent myintent= new Intent(ResultsActivity.this,EngineeringTest.class);
                   myintent.putExtra("CATEGORY","Engineering");
                   startActivity(myintent);
               }

               if(getResults.equals("Health Category")){
                   //take go to angineering test
                   Intent myintent= new Intent(ResultsActivity.this,HealthScienceTest.class);
                   myintent.putExtra("CATEGORY","Health");
                   startActivity(myintent);
               }

               if(getResults.equals("Accounting Category")){
                   //take go to angineering test
                   Intent myintent= new Intent(ResultsActivity.this,AccountingTest.class);
                   myintent.putExtra("CATEGORY","Accounting");
                   startActivity(myintent);
               }

               if(getResults.equals("Technology Category")){
                   //take go to angineering test
                   Intent myintent= new Intent(ResultsActivity.this,SoftwareEngineeringTest.class);
                   myintent.putExtra("CATEGORY","Technology");
                   startActivity(myintent);
               }
               if(getResults.equals("Education Category")){
                   //take go to angineering test
                   Intent myintent= new Intent(ResultsActivity.this,EducationTest.class);
                   myintent.putExtra("CATEGORY","Education");
                   startActivity(myintent);
               }
           }
       });


       /* String jsonString=bundle.getString("RESULTS");
        Gson gson = new Gson();
        Type listOfdoctorType = new TypeToken<List<Career>>() {}.getType();
        ArrayList<Career> careers = gson.fromJson(jsonString,listOfdoctorType );
//        String[] array = careers.toArray(new String[0]);
        StringBuffer sb = new StringBuffer();
        // Print the array
        for (Career s : careers) {
            sb.append(s);
            sb.append(" ");
        }
        String str = sb.toString();
        txtResults.setText(str);*/

       // String[] timeslots=bundle.getString("RESULTS").split(",");
       // txtResults.append(timeslots);
        //for(int i=0;i< timeslots.length;i++){
        //    timeslots[i]=careers.toString();
        //}
        //txtResults.setText(timeslots.toString());


    }
}
