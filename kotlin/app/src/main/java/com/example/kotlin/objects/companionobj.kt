package com.example.kotlin.objects

fun main(){
    Myclass.Myobject.f()
    Myclass.f()
    Myclass.automati.fa()
}

// we can create obj in class
//in class we can define multiple obj
// we can access obj fun memeber using compainon
// only one companion in class
class Myclass{
    companion object Myobject{
        fun f(){

            println("f object ")
        }

    }


    object automati{
        fun fa(){

            println("f object ")
        }

    }
}

