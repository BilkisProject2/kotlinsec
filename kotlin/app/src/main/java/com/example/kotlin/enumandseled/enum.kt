package com.example.kotlin.enumandseled
fun main(){


    var titledata = red("mshsh",22)
    var titledata2 = red("mshshd",232)
    println("${titledata.type},${titledata.pointer}")
    println("${titledata2.type},${titledata2.pointer}")
    val day = Day.SUNDAY
    println(day)
    println(day.number)
    day.printformatedday()
}
enum  class  Day(val number:Int){
    MONDAY(1),TUSEDAY(2),THURSDAY(3),FRIDAY(4),SATURDAY(5),SUNDAY(6);
    //method
    fun printformatedday(){
        println("Day is $this")
    }

//    in enum we not change value in ensum there is a instance we not vhnage the instance value in ensum
    // in enum we not change the or add  value in enum
//    .. in ensum we can use data with we set we not add data or etc
    // there is one obj and one stated and one instances
}

sealed class title
class red(val type:String ,val pointer :Int):title()
class bule(val pointer :Int):title()
// seleted we can not add data new but we can create new data from existing value
// there is more obj and more stated and more instances