package com.example.kotlin.Collection

fun main(){
    val nums= listOf(1,2,3,4,5,6,90)
    println(isodd(3))

    ///filtter
    /*
    it fillter the list and give u old
     */
    val list = nums.filter(::isodd)
    println(list)

    // we use map to convert one form to another form

    val listsmap= nums.map { it*it }
    println(listsmap)
}
fun isodd(a:Int):Boolean{
    return a%2!=0
}