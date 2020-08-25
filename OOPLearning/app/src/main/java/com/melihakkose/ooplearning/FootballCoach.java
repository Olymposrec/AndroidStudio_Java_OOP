package com.melihakkose.ooplearning;

public class FootballCoach {

    //Static Polymorphism
    public String name(){
        return "Jürgen ";
    }
    public String name(String surname){
        return "Jürgen "+ surname;
    }
    public String name(String surname, String team){
        return "Jürgen "+ surname +team;
    }



}
