package com.example.kotlin.highorder
/*
normal
fun sum(A:Int,b:Int):Int{
 return a+b}

 regular
 val sum ={a:Int,b:Int->a+b}

 */
fun main(){
    var fn :(a:Int,b:Int)->Int=::sum
    val lambdal={x:Int,y:Int->x+y}
}

fun sum(a:Int ,b:Int):Int=  a+b


fun calculator(a:Int,b:Int,gn:(Int,Int)->Int):Int {
    return gn(a,b)
}

