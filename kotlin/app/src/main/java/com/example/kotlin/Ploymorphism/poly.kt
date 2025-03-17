package com.example.kotlin.Ploymorphism

fun main(){
    // where we give explicatley :circle and :square
    // after useing polymorshism we use :shape also to keep data secrate
//    in Ploymorphism we call refernce of parent class but we store data of child class
    // parent can hold a refernces to its child
    // parent can call methods of child classes(which are common)
// decision take in runtime

    //adv
    // helps to write maintainable and extensible code
    // helps in interactings with object via commoan interface

//Poly mean many & morph mean foem
    // it mean that method name is same but it will behave differently based on the object

    val circle:circle= circle(9.0)
    val square: square=square(19.0)
    println( circle.area())
    println( square.area())
    println( square.side)
}
open class Shape{
    open  fun area():Double{
        return 0.0
    }
}
class circle (val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class square (val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}