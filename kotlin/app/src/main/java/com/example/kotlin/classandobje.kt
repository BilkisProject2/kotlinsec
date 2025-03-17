package com.example.kotlin

fun main(){
    val msutage = Car("mustang","petrol",100)
    val beetles = Car("beetles","desiel",100)

    print(msutage.name)
    print(msutage.applybreak())
    print(msutage.applybreak())
    print(beetles.applybreak())
}
//class
class  Car(var name:String,val type:String,var kmRange:Int){
    //method
    fun devivecar(){
        println("car driveing")
    }

    fun applybreak(){
        println("car applybreak")
    }
}