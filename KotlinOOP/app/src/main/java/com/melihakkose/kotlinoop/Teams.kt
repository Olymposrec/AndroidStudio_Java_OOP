package com.melihakkose.kotlinoop

open class Teams(team: String, country: String, year: Int, league:String) {

    //Public property
    /*
    var name: String?= name
    var country:String?= country
    var year:Int?= year
    var league:String?=league
     */


    //Encapsulation
    var team: String?= team
        private set
        get
    var country:String?= country
        private set
        get
    private var year:Int?= year

    var league:String?=league
        private set
        get

    private val category:String="Teams"

    fun returnCategory(password:String):String{
        if(password=="Football"){
            return category
        }else{
            return "Wrong Password!"
        }
    }


    /*
    PRIMARY CONSTRUCTOR' A cevirdik
    constructor(name:String,country:String,year:Int){
        this.country=country
        this.name=name
        this.year=year
    }
     */
}