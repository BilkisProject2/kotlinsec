package com.example.kotlin

//QUESTION 1 :  y we need array ?
// ANSWER :  if i want to store 50 fav song of a user then we neeed array
// defining 50 var is mess
// to solve this kind of problem we use array
// object that store mulitple value of same type
//fixed size
//0 bsae indexing

// SnTAX var arr = arrayof("one","two","three")

fun main()  {
    var arrofstring = arrayOf ("one","two","three")
    print(arrofstring)

    for((i,e) in arrofstring.withIndex()){
        println("$i" +"$e")
    }
    //we can access particular index of array
    print(arrofstring[0])
    //or
    println(arrofstring.get(1))

    // we can set particular index of array with value
    arrofstring.set(0,"hello")

    // we can get size of arr
    println(arrofstring.size)
}