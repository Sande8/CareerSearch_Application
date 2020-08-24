package com.example.careerapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDatabase;
    EditText editUsername,editPassword;
    private Button btnlogin,btnCreateAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase=new DatabaseHelper(this);
        editUsername=(EditText) findViewById(R.id.EditUsername);
        editPassword=(EditText) findViewById(R.id.EditPassword);
        btnlogin= (Button) findViewById(R.id.btnLogin);
        btnCreateAccount=(Button) findViewById(R.id.btnCreateAcc);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=myDatabase.getAllData();
              // if(res.getCount()==0){
                    //error
               //     ShowMessage("Error","Not Registered");
               //     return;
               // }

               StringBuffer buffer=new StringBuffer();
                String logUsername=editUsername.getText().toString();
                String logPassword=editPassword.getText().toString();
                String usernam="";
                String pass="";


                if(TextUtils.isEmpty(logUsername) ){
                    editUsername.setError("Please insert an email");
                    return;
                }
                if(TextUtils.isEmpty(logPassword) ){
                    editPassword.setError("Please insert an email");
                    return;
                }
                    while (res.moveToNext()){


                        usernam=res.getString(2);
                        pass=res.getString(3);


                        if((logUsername.equals(usernam)) && (logPassword.equals(pass))){
                            Toast.makeText(MainActivity.this,"Successfully logged in",Toast.LENGTH_LONG).show();
                            Intent myintent= new Intent(MainActivity.this,Assessment.class);
                            startActivity(myintent);


                        }else if(!(logUsername.equals(usernam)|| !(logPassword.equals(pass)))){
                            Intent myintent= new Intent(MainActivity.this,Main2Activity.class);
                            startActivity(myintent);

                            Toast.makeText(MainActivity.this,"Wrong username or password",Toast.LENGTH_LONG).show();
                        }




                    }




               // ShowMessage("Data",buffer.toString());
                editUsername.setText("");
                editPassword.setText("");

            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(myintent);
            }
        });
    }
    public void ShowMessage(String title, String message){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
