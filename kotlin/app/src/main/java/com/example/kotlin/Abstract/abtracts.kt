package com.example.kotlin.Abstract
// when we dont now the what is body of fun what to do when we use abstract
//abstarct is parent class
// we needd do use abstract in parent then only we can add abstract in child
// abstarct not have body
//when we define abstarct to property or method then we also have to define abstract to class
// we not created instantiated  of abstract
// abstract is defaultly open
//abstract class can have both abstract and non-abstract propties and methods
//if a class has abstract method or proptey then class must be declared as abstract

fun main()
{
  val circllw = circle(4.0)
    println(circllw.area())
    circllw.display()
}
abstract class Shape{
    var name:String=""
    abstract    fun area():Double
    abstract fun display()
}
class circle (val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun display() {
        print("circle is gtetting display")
    }
}
