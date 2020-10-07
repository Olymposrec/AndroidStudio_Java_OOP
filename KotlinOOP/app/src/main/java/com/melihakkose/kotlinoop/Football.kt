package com.melihakkose.kotlinoop

class Football {


    //Property
    var name: String? = null
    var age:Int? = null

    //Constructor -> Cagirilan ilk fonksiyon  & init (ayni sey) KOTLINDE ASAGIDAKI GIBI KULLANILMAZ
    constructor(nameInput:String,ageInput:Int){

        this.name=nameInput
        this.age=ageInput

        //println("Constructor Called!")

    }


    /*
    init {
        println("Init Called!")
    }

     */

}