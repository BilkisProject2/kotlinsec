package com.example.kotlin

//fun overloading : same name diff parameter
//name argument :  println(addition(a= 1.1,b = 2.2))
// we can store function in variable var fn=::addition
//:: we use this
//var fn=::addition
//    fn (1,2)
fun main () {
    var fn=::addition
    fn (1,2)
    println(addition(1,2))
//    println(addition(1.1,2.2))

}

fun addition (a:Int,b:Int):Int{
    return a+b
}

//fun addition (a:Double,b:Double):Double{
//    return a+b
//}