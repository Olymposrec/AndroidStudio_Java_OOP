package com.melihakkose.ooplearning;

public class FootballPLayer {
    private String name;
    private String team;
    private int age;


    public FootballPLayer(String name, String team, int age){
        this.age=age;
        this.team=team;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, String password) {
        if(password.matches("Olymposrec")){
            this.age = age;
        }else{
            System.out.println("Access Denied!");
        }

    }
}
