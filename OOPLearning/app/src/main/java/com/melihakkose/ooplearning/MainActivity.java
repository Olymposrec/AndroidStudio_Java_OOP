package com.melihakkose.ooplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User userOne=new User();
        myUser.name="Melih";
        myUser.surname="Akkose";
        myUser.age=22;

        User userTwo= new User();
        myUser.name="Mahmut";
        myUser.surname="Saylan";
        myUser.age=34;
        */

        User userONe=new User("Melih","Akkose",22);

        System.out.println(userONe.name);


        //Encapsulation (Kapsülleme)
        FootballPLayer playerOne=new FootballPLayer("Muhammed Salah","Liverpool FC",32);
        playerOne.setAge(36,"Olymposrec");
        System.out.println(playerOne.getAge());

        playerOne.setAge(50,"wrongpassword");
        System.out.println(playerOne.getAge());

        //Inheritance (Miras Alma)
        LegendsFootballPLayer Ronaldo =new LegendsFootballPLayer("Cristiano Ronaldo","Juventus FC",32);
        System.out.println(Ronaldo.getName());
        System.out.println(Ronaldo.shot());

        //Polymorphism

        //Static Polymorphism
        FootballCoach coach=new FootballCoach();
        System.out.println(coach.name());
        System.out.println(coach.name("Kloop"));
        System.out.println(coach.name("Kloop","Liverpool FC"));

        //Dynamic Polymorphism
        Animal animalOne= new Animal();
        animalOne.sound();

        Dog animalDog=new Dog();
        animalDog.test();
        animalDog.sound();

        //abstract
        System.out.println(userONe.info());

        //Interface
        Guitar myGuiter=new Guitar();
        myGuiter.model="1968 Fender Strat";
        myGuiter.available=true;
        myGuiter.info();





    }
}