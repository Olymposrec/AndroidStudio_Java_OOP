package com.melihakkose.ooplearning;

public class LegendsFootballPLayer extends FootballPLayer {

    //Super kelimesi extend edilen sinifa referans verir
    public LegendsFootballPLayer(String name, String team, int age) {
        super(name, team, age);
    }

    public String shot(){
        return "Gooolll";
    }
}
