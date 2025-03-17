package com.example.kotlin.highorder
/*
we use :: to store fun in variable
fun is called ist class citizen

HIDHER ORDER FUNCTIONS : FUN THAT ACCEPTS FUN AS ARGUMENT OR RETURN FUN OR BOTH

FUNCTION TYPE : WHICH TAKE INT AND GIVE INT
 */
fun main(){
    var fn: (a:Double ,b:Double)->Double=::sum
    println(fn(2.0,2.9))
    println(calculator(2.0,2.9,::sum))
}
fun sum(a:Double ,b:Double):Double {
    return a+b
}

fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result= gn(a,b)
    println(result)
}