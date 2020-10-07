package com.melihakkose.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var myFootball=Football("Cristiano Ronaldo",50)

        /*
        println(myFootball.name)
        println(myFootball.age.toString())

         */


        /*
        myFootball.age=32
        myFootball.name="Muhammed Salah"
        println(myFootball.name)
        println(myFootball.age.toString())

         */
        /*
        var liverpool=Teams("Liverpool","England",1892,"Premiere League")
        println(liverpool.name)

        //encapsulation
        println(liverpool.returnCategory("Football"))
        println(liverpool.returnCategory("noucamp"))

         */
        /*
        var ronaldo=FootballPlayer("Cristiano Ronaldo","Juventus FC", "Portugal",1897,"Seria A")
        println(ronaldo.returnCategory("Football"))
        ronaldo.cv()
        println(ronaldo.name)
        println("I'm From "+ronaldo.country)
        println("I'm playing at " +ronaldo.team)

         */

        //polymorphism (ayni isimler ile farkli islemler yapmak gibi)

        /*static polymorphism-------------------
        var mathematics=Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(5,5))
        println(mathematics.sum(5,5,5))

        dynamic polymorphism----------------
        var animal=Animal()
        animal.say()
        var tiger=Tiger()
        tiger.test()
        tiger.say()
         */

        //Abstract & Interface
        /*
        var myUser=User()
        println(myUser.info())

         */

        //var myPeople=People() --> Abstract class dan obje olusturulamaz
        /*
        var myShoes=Shoes()
        myShoes.brand="Nike"
        myShoes.stock=true
        println(myShoes.brandName)
        myShoes.info()
        myShoes.info2()

         */

        //Lambda expressions -> fonksiyonu tek satirda yazmayi olanak saglar gibi
        /* BU ORNEGI LAMBDA OLARAK YAZACAGIZ
        fun printString(myString:String){
            println(myString)
        }
        printString("Test String")

         */
        val testString={myString:String->println(myString)}
        testString("Lambda Expressions: Test")

        val multiply={a:Int, b:Int -> a * b}
        println(multiply(5,5))
        val multiply2:(Int,Int)->Int={a,b-> a * b}
        println(multiply2(5,5))

        /*
        Lambda Expressions -> Genelde internetten veri cekerken kullanilir
        asynchrnous -> Senkronize olmayan,
        kullanici ekranini kitlemeden arkaplanda yapilacak islemler icin
        callback function, listener function, completion function
        */
        fun downloadFootballPlayers(url:String, completion:(/*ICINE OBJE DE KOYABILIRDIK*/)-> Unit){
            //url-> Download
            //islemler...
            //OBJEYI OLUSTURUR
            completion(/*FONKSIYONUN ICINE OBJEYI VEREBILIRDIK*/)
        }
        downloadFootballPlayers("transfermarkt.com",{
            println("Completed!")
        })








    }
}