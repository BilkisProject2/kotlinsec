package com.example.kotlin.Inhertances

//what is inheratance?
//that bhavious with we get from parent
//Inheritance enables code re-usability, it allows all the features from an existing class(base class) to be inherited by a new class(derived class). In addition, the derived class can also add some features of its own.
// we use open key word to inhertinces the class
//we can inhertaces the class using open before the class and using that on another class like this class basicphone():Phone(){


fun main(){
    val objchild=child()
    objchild.myMethod2()
    objchild.myMethod()

}

open class Parent{
    val name:String=""
    fun myMethod(){
        println("I AM IN PARENT")
    }
}

 class child:Parent(){
    val name2:String=""
    fun myMethod2(){
        println("I AM IN CHILD")
    }
}