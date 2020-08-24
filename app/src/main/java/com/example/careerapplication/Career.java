package com.example.careerapplication;
import java.util.*;
public class Career
{
    public ArrayList<String>skills;
    public String name;
    public Career(String name,ArrayList<String>skills) {
        this.name=name;
        this.skills=skills;
    }

    public String AddCareer(String name,ArrayList<String>skills){

        return name;
    }

    public String getName(){
        return this.name;

    }

    public String setName(String newName){
        return (this.name=newName);
    }

    public ArrayList<String> getSkills(){
        return this.skills;
    }
    public ArrayList<String> setSkills(ArrayList<String>newSkills){
        return (this.skills=newSkills);
    }

    @Override
    public String toString(){
        return String.format("%s\t%s",this.name,"");
    }
}

