package com.melihakkose.kotlinoop

class Tiger: Animal() {

     fun test(){
        super.say()
    }

    override fun say(){
        println("Override Tiger say")
    }
}