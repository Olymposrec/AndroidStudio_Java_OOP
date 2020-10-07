package com.melihakkose.kotlinoop

class Shoes : Outdoor,Casual{

    var brand:String?=null
    var stock:Boolean?=null
    override var brandName: String
        get() = "Wolf Skins"
        set(value) {}

    override fun info() {
        println("Override Casual Fun. (in Shoes)")
    }
}