package com.example.kotlin.interfaces

import com.example.kotlin.Abstract.Shape

fun main(){
    dragobject(arrayOf(circle(2.2),square(2.2),triangle(2.2,6.0)))
}

fun dragobject(objects:Array<shape>){
    for(obj in objects ){
        obj.drag()
    }
}

// in interface when we create fun and not give body is defalut take to abstarct
// we can create multiple interface like this Draggable, clone
//in abstract we not create like this  Draggable, clone
// abstract work on type and interface work on behavious
// in interface can have both abstract and concrete methods
//interface can implement other interface
// and one class can  implement many interface
// but classes can have only one superclass


interface  Draggable{
    fun drag()
}

interface  clone{
    fun clone()
}

abstract  class shape():Draggable, clone{
    abstract fun area():Double

}

class circle(val radius:Double):shape(){
    override fun area(): Double =
        Math.PI*radius*radius

    override fun drag() {
       println("circle")
    }

    override fun clone() {
        println("circle")
    }
}

class square(val side:Double):shape(){
    override fun area(): Double =
        side*side
    override fun drag() {
        println("square")
    }
    override fun clone() {
        println("circle")
    }
}

class triangle (val base:Double,val height:Double):shape(){
    override fun area(): Double = 0.5 *base*height
    override fun drag() {
        println("triangle")
    }
    override fun clone() {
        println("circle")
    }

    class player(val name:String){
        fun drag()= println("$name")

    }

}