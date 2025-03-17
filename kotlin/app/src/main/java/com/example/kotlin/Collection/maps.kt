package com.example.kotlin.Collection
/*
store key-value map
it also have mutable and inmutable
 */
fun main(){
    //mutable example
    val student = mutableMapOf<Int,String>()
    student.put(1,"bilkis")
    student.put(2,"zafar")
    student.put(3,"Sameera")
    student.put(4,"Sameer")
    println( student.get(3))
    for ((key:Int,Value:String) in student){
        println("$key-$Value")
    }
    //alternat of get and put
    student[0]="b"
    println(student[0])

    //inmutable
    val students = mapOf<Int,String>(1 to "bb" , 2 to "ss")
    println(students)
}
class maps {
}