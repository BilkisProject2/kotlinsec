package com.example.kotlin
// block of code to perforn certain functionally
//help to resue code

//syntax
//fun functionname(paratmeter 1,paramtere 2 ,etc): return type {}
//parameter cannot be reasign
fun main ()  {
    add(2,2)

}

fun add(num1 :Int, num2 :Int):Int{
    val sum = num1+num2;
    print(sum)
    return sum

}
