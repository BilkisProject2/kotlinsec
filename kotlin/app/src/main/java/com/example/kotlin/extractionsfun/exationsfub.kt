package com.example.kotlin.extractionsfun
/*
when we useing extraion function we not able to access class private var
 */

fun main(){
    println("hello".formattedstring())
}
//extion fun
fun String.formattedstring():String{
    return "--------------------------\n$this------------------------"
}