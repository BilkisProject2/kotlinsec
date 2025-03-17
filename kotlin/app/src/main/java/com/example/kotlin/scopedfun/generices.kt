package com.example.kotlin.scopedfun

fun main(){
    val con= intconitere(2)
    println(con)
    val i = conatainer("ggg")
    val id = conatainer(77)
    println(i)
    println(id)
}
/*
 now i what int then we create int fun and then after some time we want string and then we call
 string fun to privanted from this we have create generice when can use any data type in one fun only
 we use <T> in genric
 */


class conatainer<T>(var data :T){
    fun setvalu(value:T){
        data= value
    }
    fun getvalue():T{
        return  data
    }
}

class intconitere(var data:Int){
    fun setvalu(value:Int){
        data= value
    }
    fun getvalue():Int{
        return  data
    }
}