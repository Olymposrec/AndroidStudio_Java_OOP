package com.melihakkose.kotlinoop

class FootballPlayer(name: String,team: String, country: String, year: Int, league: String) :
    Teams(team, country, year, league) {

    var name:String=name
    //open keyword' u ile objemizi aciyoruz
    fun cv(){
        println("Hi I'm ...")
    }
}