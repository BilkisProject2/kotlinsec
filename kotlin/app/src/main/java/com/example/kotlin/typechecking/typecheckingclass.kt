package com.example.kotlin.typechecking

fun main(){
    dragobject(arrayOf(circle(2.2),square(2.2),triangle(2.2,6.0)))
    val circle = circle(4.0)
    var player = player("player ")
    if (circle is circle){
        println("this is circle")
    }

    val arr= arrayOf(circle,player)
    for(obj in arr){
        if(obj is circle)
        {
            // radius is circl propetres
            println(obj.radius)
        }else{
            //cast using as
            //when we not get automatically dropdown
            println(obj as player)
        }
    }
}

fun dragobject(objects:Array<shape>){
    for(obj in objects ){
        obj.drag()
    }
}




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


}
class player(val name:String){
    fun drag()= println("$name")

}
