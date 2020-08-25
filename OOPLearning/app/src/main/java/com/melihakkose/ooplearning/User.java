package com.melihakkose.ooplearning;

public class User extends People{
    //Property (Ozellik)
    String name;
    String surname;
    int    age;

    //Constructor (kurucu method)
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        System.out.println("User Created!");
    }

}
