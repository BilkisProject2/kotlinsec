package com.example.kotlin.Inhertances


// without inhertance the parent class
//class BasicPhone {
//    val name:String="Nokia"
//    val type:String="Baic 100"
//    val volume:Int=10
//
//    fun makecall(){}
//    fun display(){}
//    fun poweroff(){}
//    fun getdeviceoff(){}
//
//    fun getscreeninfo(){}
//}


//AFTER USING INHERTANCE LIKE THIS
//we remove all duplicated thing from child
class BasicPhone:PhoneParents() {
    fun getscreeninfo(){}
}