package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;

public class Assessment extends AppCompatActivity {

    private Button btnassessment;
    private CheckBox talkative,relationship,educate,friendly,kind,curious,advocator,
    communicskill,plannskill,analystskill,solvproblem,timemanskill,teamplayer,independent,adapt,
    business,leadership, customercare,multitask,continuousLearn,creative;
    public static ArrayList<Career> careers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);
        careers=new ArrayList<>();
        ArrayList<String>skil=new ArrayList<>();
        Career mycareer=new Career("Doctor",skil);


        mycareer.skills.add("Communication");
        mycareer.skills.add("Problem solver");
        careers.add(mycareer);
        relationship=(CheckBox)findViewById(R.id.cbStudenRelationship) ;
        educate=(CheckBox) findViewById(R.id.cbEducating);
        friendly=(CheckBox) findViewById(R.id.cbFriendly);
        kind=(CheckBox) findViewById(R.id.cbKind);
        curious=(CheckBox)findViewById(R.id.cbCurious);
        advocator=(CheckBox) findViewById(R.id.cbAdvocator);
        communicskill=(CheckBox) findViewById(R.id.cbCommunicationSkill);
        plannskill=(CheckBox) findViewById(R.id.cbPlanning);
        analystskill=(CheckBox) findViewById(R.id.cbAnalytical);
        solvproblem=(CheckBox) findViewById(R.id.cbSolvingProblem);
        timemanskill=(CheckBox) findViewById(R.id.cbTimeManagement);
        teamplayer=(CheckBox) findViewById(R.id.cbTeamPlayer);
        independent=(CheckBox) findViewById(R.id.cbIndependant);
        adapt=(CheckBox) findViewById(R.id.cbAdaptation);
        business=(CheckBox) findViewById(R.id.cbBusinessSkill);
        leadership=(CheckBox) findViewById(R.id.cbLeadership);
        customercare=(CheckBox) findViewById(R.id.cbCustomerService);
        multitask=(CheckBox) findViewById(R.id.cbMultiTasking);
        creative=(CheckBox) findViewById(R.id.cbCreative);
        continuousLearn=(CheckBox) findViewById(R.id.cbContinousLeaner);

        btnassessment=(Button) findViewById(R.id.btnSubmitAssessment);
        btnassessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //OtherClass myObject = new OtherClass("Hello World!");
                ArrayList<String>Teacherskil=new ArrayList<>();
                ArrayList<String>Doctorskil=new ArrayList<>();
                ArrayList<String>SoftwareEngineerskil=new ArrayList<>();
                ArrayList<String>Accountingskil=new ArrayList<>();
                ArrayList<String>MechanicalEngineerskil=new ArrayList<>();


                //skills for software engineer


                //skills for accountant


                //skills for mechenical engineer

                if(relationship.isChecked()){
                    Teacherskil.add("Relationship builder");
                    Teacherskil.add("Relationship builder");
                    Teacherskil.add("Relationship builder");
                    MechanicalEngineerskil.add("Relationship builder");
                    SoftwareEngineerskil.add("Relationship builder");
                    SoftwareEngineerskil.add("Relationship builder");
                    Accountingskil.add("Relationship builder");
                }

                if(educate.isChecked()){
                    Teacherskil.add("love educating people");
                    Teacherskil.add("love educating people");
                    Teacherskil.add("love educating people");
                    Teacherskil.add("love educating people");
                    Doctorskil.add("love educating people");
                    Doctorskil.add("love educating people");
                    SoftwareEngineerskil.add("love educating people");
                    Accountingskil.add("educate");
                }

                if(friendly.isChecked()){
                    Teacherskil.add("friendly person");
                    Teacherskil.add("friendly person");
                    Teacherskil.add("friendly person");
                    Doctorskil.add("friendly person");
                    Doctorskil.add("friendly person");
                    SoftwareEngineerskil.add("friendly person");
                    MechanicalEngineerskil.add("friendly person");
                }
                if(kind.isChecked()){

                    Doctorskil.add("kindness");
                    Doctorskil.add("kindness");
                    Doctorskil.add("kindness");
                    Teacherskil.add("Kindness");
                    Accountingskil.add("Kindness");

                }
                if(curious.isChecked()){

                    Doctorskil.add("curiousness");
                    SoftwareEngineerskil.add("curiousness");
                    SoftwareEngineerskil.add("curiousness");
                    MechanicalEngineerskil.add("Curiousness");
                    MechanicalEngineerskil.add("Curiousness");
                    MechanicalEngineerskil.add("Curiousness");


                }
                if(advocator.isChecked()){

                    Doctorskil.add("Advocate for people");
                    Doctorskil.add("Advocate for people");
                    Doctorskil.add("Advocate for people");
                    Doctorskil.add("Advocate for people");
                    Accountingskil.add("Advocate for people");
                    SoftwareEngineerskil.add("Advocate for people");
                    SoftwareEngineerskil.add("Advocate for people");
                    SoftwareEngineerskil.add("Advocate for people");

                }
                if(communicskill.isChecked()){
                    Teacherskil.add("Communication");
                    Teacherskil.add("Communication");
                    Doctorskil.add("Communication");
                    SoftwareEngineerskil.add("Communication");
                    Accountingskil.add("Communication");
                    MechanicalEngineerskil.add("Communication");


                }
                if(plannskill.isChecked()){

                    Teacherskil.add("good planner");
                    Teacherskil.add("good planner");
                    MechanicalEngineerskil.add("good planner");
                    Accountingskil.add("good planner");

                }
                if(analystskill.isChecked()){

                    Doctorskil.add("good analyser");
                    Accountingskil.add("good analyser");
                    MechanicalEngineerskil.add("good analyser");
                    MechanicalEngineerskil.add("good analyser");
                    MechanicalEngineerskil.add("good analyser");



                }
                if(solvproblem.isChecked()){

                    Doctorskil.add("Problem solver");
                    Doctorskil.add("Problem solver");
                    Doctorskil.add("Problem solver");
                    SoftwareEngineerskil.add("Problem solver");
                    SoftwareEngineerskil.add("Problem solver");
                    MechanicalEngineerskil.add("Problem solver");
                    Accountingskil.add("Problem solver");



                }
                if(timemanskill.isChecked()){
                    Teacherskil.add("good in time management");
                    Doctorskil.add("good in time management");
                    MechanicalEngineerskil.add("Good in management");

                }
                if(teamplayer.isChecked()){

                    Doctorskil.add("Team player");
                    SoftwareEngineerskil.add("Team player");
                    Accountingskil.add("Team player");
                    MechanicalEngineerskil.add("Team player");
                }
                if(independent.isChecked()){

                    Accountingskil.add("Can work independantly");
                    MechanicalEngineerskil.add("Can work independantly");


                }
                if(adapt.isChecked()){

                    SoftwareEngineerskil.add("easily adapt");
                    SoftwareEngineerskil.add("easily adapt");
                    SoftwareEngineerskil.add("easily adapt");
                    MechanicalEngineerskil.add("easily adapt");
                    MechanicalEngineerskil.add("easily adapt");
                    Accountingskil.add("Easily adapt");

                }
                if(business.isChecked()){

                    Accountingskil.add("Has business knowledge");
                    Accountingskil.add("Has business knowledge");
                    Accountingskil.add("Has business knowledge");
                    SoftwareEngineerskil.add("has business knowledge");
                    SoftwareEngineerskil.add("has business knowledge");

                }
                if(leadership.isChecked()){
                    Accountingskil.add("good leader");
                    Accountingskil.add("good leader");
                    Accountingskil.add("good leader");
                    SoftwareEngineerskil.add("good leader");
                    SoftwareEngineerskil.add("good leader");
                }
                if(customercare.isChecked()){
                    Accountingskil.add("Can work with customers");
                }
                if(multitask.isChecked()){
                    Accountingskil.add("Good in Maltitasking");
                    MechanicalEngineerskil.add("Good in maltitasking");
                    MechanicalEngineerskil.add("Good in maltitasking");
                    MechanicalEngineerskil.add("Good in maltitasking");
                }
                if(creative.isChecked()){
                    MechanicalEngineerskil.add("Creative person");
                    MechanicalEngineerskil.add("Creative person");
                    MechanicalEngineerskil.add("Creative person");
                    SoftwareEngineerskil.add("Creative person");
                    SoftwareEngineerskil.add("Creative person");

                }
                if(continuousLearn.isChecked()){
                    Doctorskil.add("continuous learner");
                    SoftwareEngineerskil.add("continous learner");
                    SoftwareEngineerskil.add("continous learner");
                    SoftwareEngineerskil.add("continous learner");
                    Accountingskil.add("Continuas learner");
                    MechanicalEngineerskil.add("Continous learner");
                    MechanicalEngineerskil.add("Continous learner");
                }

                // Career mycareer=new Career("Doctors",skil);
                careers=new ArrayList<Career>();
                // mycareer.skills.add("Communication");
                // mycareer.skills.add("Problem solver");

                /*careers.add(new Career("Education Careers",Teacherskil));
                careers.add(new Career("\nHealth Science Careers",Doctorskil));
                careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));
                careers.add(new Career("\nAccounting Careers",Accountingskil));
                careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));*/



                //if teacher skills are less, then the teach will not be shown
         /*      if(Teacherskil.size()<Doctorskil.size()&&
               Teacherskil.size()<SoftwareEngineerskil.size()&&
               Teacherskil.size()<Accountingskil.size()&&
               Teacherskil.size()<MechanicalEngineerskil.size()){
                   careers.add(new Career("\nHealth Science Careers",Doctorskil));
                   careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));
                   careers.add(new Career("\nAccounting Careers",Accountingskil));
                   careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));

               }

                //if teacher skills are more, then the teach will not be shown
                if(Teacherskil.size()>Doctorskil.size()&&
                        Teacherskil.size()>SoftwareEngineerskil.size()&&
                        Teacherskil.size()>Accountingskil.size()&&
                        Teacherskil.size()>MechanicalEngineerskil.size()){
                    careers.add(new Career("Education Careers",Teacherskil));

                }

                //if doctor skills are less, then the teach will not be shown
                if(Doctorskil.size()<Teacherskil.size()&&
                        Doctorskil.size()<SoftwareEngineerskil.size()&&
                        Doctorskil.size()<Accountingskil.size()&&
                        Doctorskil.size()<MechanicalEngineerskil.size()){
                    careers.add(new Career("Education Careers",Teacherskil));
                    careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));
                    careers.add(new Career("\nAccounting Careers",Accountingskil));
                    careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));

                }

                //if doctor skills are more, then the teach will not be shown
                if(Doctorskil.size()>Teacherskil.size()&&
                        Doctorskil.size()>SoftwareEngineerskil.size()&&
                        Doctorskil.size()>Accountingskil.size()&&
                        Doctorskil.size()>MechanicalEngineerskil.size()){
                    careers.add(new Career("\nHealth Science Careers",Doctorskil));

                }

                //if software engineering skills are less, then the teach will not be shown
                if(SoftwareEngineerskil.size()<Doctorskil.size()&&
                        SoftwareEngineerskil.size()<Teacherskil.size()&&
                        SoftwareEngineerskil.size()<Accountingskil.size()&&
                        SoftwareEngineerskil.size()<MechanicalEngineerskil.size()){
                    careers.add(new Career("Education Careers",Teacherskil));
                    careers.add(new Career("\nHealth Science Careers",Doctorskil));
                    careers.add(new Career("\nAccounting Careers",Accountingskil));
                    careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));

                }

                //if software engineering skills are more, then the teach will not be shown
                if(SoftwareEngineerskil.size()>Doctorskil.size()&&
                        SoftwareEngineerskil.size()>Teacherskil.size()&&
                        SoftwareEngineerskil.size()>Accountingskil.size()&&
                        SoftwareEngineerskil.size()>MechanicalEngineerskil.size()){
                    careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));

                }

                //if Accounting skills are less, then the teach will not be shown
                if(Accountingskil.size()<Doctorskil.size()&&
                        Accountingskil.size()<SoftwareEngineerskil.size()&&
                        Accountingskil.size()<Teacherskil.size()&&
                        Accountingskil.size()<MechanicalEngineerskil.size()){
                    careers.add(new Career("Education Careers",Teacherskil));
                    careers.add(new Career("\nHealth Science Careers",Doctorskil));
                    careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));
                    careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));

                }
                //if Accounting skills are more, then the teach will not be shown
                if(Accountingskil.size()>Doctorskil.size()&&
                        Accountingskil.size()>SoftwareEngineerskil.size()&&
                        Accountingskil.size()>Teacherskil.size()&&
                        Accountingskil.size()>MechanicalEngineerskil.size()){
                    careers.add(new Career("\nAccounting Careers",Accountingskil));

                }


                //if mechenical engineering skills are less, then the teach will not be shown
                if(MechanicalEngineerskil.size()<Doctorskil.size()&&
                        MechanicalEngineerskil.size()<SoftwareEngineerskil.size()&&
                        MechanicalEngineerskil.size()<Accountingskil.size()&&
                        MechanicalEngineerskil.size()<Teacherskil.size()){
                    careers.add(new Career("Education Careers",Teacherskil));
                    careers.add(new Career("\nHealth Science Careers",Doctorskil));
                    careers.add(new Career("\nTechnology Careers",SoftwareEngineerskil));
                    careers.add(new Career("\nAccounting Careers",Accountingskil));

                }

                //if mechenical engineering skills are more, then the teach will not be shown
                if(MechanicalEngineerskil.size()>Doctorskil.size()&&
                        MechanicalEngineerskil.size()>SoftwareEngineerskil.size()&&
                        MechanicalEngineerskil.size()>Accountingskil.size()&&
                        MechanicalEngineerskil.size()>Teacherskil.size()){
                    careers.add(new Career("\nEngineer Careers", MechanicalEngineerskil));

                }*/

                int a = Teacherskil.size();
                int b = Doctorskil.size();
                int c= SoftwareEngineerskil.size();
                int d= Accountingskil.size();
                int e= MechanicalEngineerskil.size();

                String takeResults="";
                int[] numbers={a,b,c,d,e};

                int maxValue = numbers[0];
                for(int i=1;i < numbers.length;i++){
                    if(numbers[i] > maxValue){
                        maxValue = numbers[i];
                    }
                }
                if(maxValue==e){
                    takeResults="Engineering Category";
                }

                if(maxValue==d){
                    takeResults="Accounting Category";
                }
                if(maxValue==c){
                    takeResults="Technology Category";
                }
                if(maxValue==b){
                    takeResults="Health Category";

                }
                if(maxValue==a){
                    takeResults="Education Category";

                }

                Intent myintent=new Intent(Assessment.this,ResultsActivity.class);
                myintent.putExtra("RESULTS",takeResults);
                startActivity(myintent);
               // Career mycareer=new Career("Doctor",skil);
                /*Gson gson=new Gson();
                String jsonString=gson.toJson(careers);
                Intent myintent=new Intent(Assessment.this,ResultsActivity.class);
                myintent.putExtra("RESULTS",jsonString);
                //myintent.putParcelableArrayListExtra("RESULTS",careers.toString());
                startActivity(myintent);*/



            }
        });
    }
}
