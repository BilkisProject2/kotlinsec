package com.example.kotlin.Inhertances

fun main(){
    var onepulsevar = onepulse()
    onepulsevar.name = "Bilkis"
    onepulsevar.display()
    var mobile = Mobile()
    mobile.display()
}

open class Mobile(){
   open  var name :String=""
    val size :Int = 5;
open fun makecall()= print("calling mobile")
    open fun poweroff()= print("poweroff mobile")
    open fun display()= println("display mobile")
}

class onepulse():Mobile(){
    override fun display() {
        super.display() // super is use to call parent fun
        print("calling mobile override " )

    }
}