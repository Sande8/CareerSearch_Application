package com.example.careerapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="CareerApp.db";
    public static final String TABLE_NAME="Person_table";
    public static final String SECOND_TABLE="Career_table";

    public static final String COL_1="Person_ID";
    public static final String COL_2="Person_Email";
    public static final String COL_3="Person_Username";
    public static final String COL_4="Person_Password";

    //columns of the second table
    public static final String COLUMN_1="Career_Id";
    public static final String COLUMN_2="Career_name";
    public static final String COLUMN_3="Career_description";
    public static final String COLUMN_4="Explainer";
    public static final String COLUMN_5="Communicator";
    public static final String COLUMN_6="Problem_solver";
    public static final String COLUMN_7="Patiance_and_Care";
    public static final String COLUMN_8="Critical_Thinker";
    public static final String COLUMN_9="Analyse";
    public static final String COLUMN_10="Planner";
    public static final String COLUMN_11="Counseling";
    public static final String COLUMN_12="Curious";
    public static final String COLUMN_13="Team_player";
    public static final String COLUMN_14="Continuous_learner";
    public static final String COLUMN_15="friendliness";
    public static final String COLUMN_16="Kindliness";
    public static final String COLUMN_17="Advocation";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 2);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+TABLE_NAME +"(Person_ID INTEGER PRIMARY KEY AUTOINCREMENT,Person_Email TEXT,Person_Username TEXT,Person_Password TEXT)");
        db.execSQL("create table "+SECOND_TABLE +"(Career_Id INTEGER PRIMARY KEY AUTOINCREMENT,Career_name TEXT,Career_description TEXT,Explainer TEXT," +
                "Communicator TEXT,Problem_solver TEXT,Planner TEXT,Patiance_and_Care TEXT,Analyse TEXT,Critical_Thinker TEXT,Counseling TEXT," +
                "Curious TEXT,Team_player TEXT,Continuous_learner TEXT,friendliness TEXT,Kindliness TEXT,Advocation TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS TABLE_NAME");
        db.execSQL("DROP TABLE IF EXISTS SECOND_TABLE");
        onCreate(db);
    }

    public boolean InsertData(String email,String username, String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,username);
        contentValues.put(COL_4,password);
        long results=(db.insert(TABLE_NAME,null,contentValues));
        if(results==-1){
            return false;
        }else{
            return true;
        }

    }
    public boolean InsertCareerData(String Career_name,String Career_description,String Sk_Explainer,String SK_Communicator,
                                    String SK_Problem_solver,String SK_Patiance_and_care,String SK_Critical_thinking,String SK_analyse,
    String SK_planner,String SK_councelling,String SK_curious,String SK_team_player,String SK_continuous_learner,String SK_friendness,String SK_kindness,String SK_advocate){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues2=new ContentValues();
        contentValues2.put(COLUMN_2,Career_name);
        contentValues2.put(COLUMN_3,Career_description);
        contentValues2.put(COLUMN_4,Sk_Explainer);
        contentValues2.put(COLUMN_5,SK_Communicator);
        contentValues2.put(COLUMN_6,SK_Problem_solver);
        contentValues2.put(COLUMN_7,SK_Patiance_and_care);
        contentValues2.put(COLUMN_8,SK_analyse);
        contentValues2.put(COLUMN_9,SK_planner);
        contentValues2.put(COLUMN_10,SK_councelling);
        contentValues2.put(COLUMN_11,SK_curious);
        contentValues2.put(COLUMN_12,SK_team_player);
        contentValues2.put(COLUMN_13,SK_continuous_learner);
        contentValues2.put(COLUMN_14,SK_friendness);
        contentValues2.put(COLUMN_15,SK_kindness);
        contentValues2.put(COLUMN_16,SK_advocate);
        long outputs=(db.insert(SECOND_TABLE,null,contentValues2));
        if(outputs==-1){
            return false;
        }else{
            return true;
        }
    }
    public Cursor getAllCareerData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor giveCareers=db.rawQuery("select * from Career_table",null);
        return giveCareers;
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from Person_table",null);
        return res;
    }
}
