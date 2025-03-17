package com.example.kotlin.Dataclasses

import com.example.kotlin.persone

fun main(){
    val p1=Person(1,"b")
    val p2=Person(1,"b")
    println(p1)
    println(p2)
    println(p1.hashCode())
    print(p1==p2)

    var p3 = p1.copy(2)
    println(p3)

    val (id,name)= p1
    println(p1)
}

 data class Person(val id:Int,var name :String){

}