package com.example.careerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    DatabaseHelper myDatabase;
    EditText edtEmail, edtUsername, edtPassword,editConfirm;
    TextView txtTest;
    Button btnreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myDatabase=new DatabaseHelper(this);

        edtEmail=(EditText) findViewById(R.id.EditEmail);
        edtUsername=(EditText) findViewById(R.id.EditR_Username);
        edtPassword=(EditText) findViewById(R.id.EditR_Password);
        editConfirm=(EditText) findViewById(R.id.EditConfirm_Password);
        txtTest=(TextView) findViewById(R.id.txtTest);
        btnreg=(Button) findViewById(R.id.btnRegister);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String email=edtEmail.getText().toString();
              String username=edtUsername.getText().toString();
              String password=edtPassword.getText().toString();
              String confirmpass=editConfirm.getText().toString();
               boolean isInserted= myDatabase.InsertData(email,username,password);

             /*  if(isInserted ==true) {
                   Intent myintent = new Intent(Main2Activity.this, MainActivity.class);
                   startActivity(myintent);
                   Toast.makeText(Main2Activity.this, "Successfully registered", Toast.LENGTH_LONG).show();
               }
               else{
                   Toast.makeText(Main2Activity.this,"Oooooops something went wrong",Toast.LENGTH_LONG).show();
               }*/
            // ||TextUtils.isEmpty(username) ||TextUtils.isEmpty(password)
             if(TextUtils.isEmpty(email) ){
                 edtEmail.setError("Please insert an email");
                 return;
             }
                if(TextUtils.isEmpty(username) ){
                    edtUsername.setError("Please insert username");
                    return;
                }
                if(TextUtils.isEmpty(password) ){
                    edtPassword.setError("Please insert password");
                    return;
                }
                if(TextUtils.isEmpty(confirmpass)){
                    editConfirm.setError("Please confirm password");
                    return;
                }
                if(!(password.equals(confirmpass))){
                    editConfirm.setError("Password does not match");
                    return;
                }



                if(isInserted ==true) {
                    Intent myintent = new Intent(Main2Activity.this, MainActivity.class);
                    startActivity(myintent);
                    Toast.makeText(Main2Activity.this, "Successfully registered", Toast.LENGTH_LONG).show();
                }

                edtEmail.setText("");
                edtUsername.setText("");
                edtPassword.setText("");

            }
        });


    }
}
