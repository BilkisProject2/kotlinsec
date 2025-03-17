package com.example.kotlin.scopedfun
/*
when we use varage we can set multiple value
 */
fun main(){
    add(1,2,3,8,0)
    adds(3)
}

fun add(vararg values:Int){
    var  sum = 0
    for(i:Int in values){
        sum += i
    }
}

//diff

fun adds( values:Int){
    var  sum = 0
    sum = sum+sum

}