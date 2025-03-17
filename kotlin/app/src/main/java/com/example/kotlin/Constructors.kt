package com.example.kotlin

fun main(){
    // constructors
    //class has 2 thing - properties & methods
    //initaliing obj & provide default value to propertiites
    //constuces are use to give default value to object
    var car = automobile("car",3,10,true)

    //seconday construct not need tyres and maxseat value it take from primary constructes
    var secondCar=Automobile("bmw","perole")
    print(car.name)
    print(secondCar)
}
// this is constructeres : (val name:String, val  tyres:Int,val maxseating:Int)  = propertie shave var and val
//hasairbag:Boolean is parameter
//PRIMARY CONSTRUCTERES CODE AND EXPAME
class  automobile(val name:String, val  tyres:Int,val maxseating:Int, hasairbag:Boolean){
    fun drive(){}
    fun applybreak(){}
}


class person(){
    //properties
    val name:String=""
    val age:Int=0
}

// seconddary constructers
class Automobile(val name:String, val tyres:Int,val maxseat:Int,val enginType:String){
    fun drive(){}
    fun applybreak(){}

    //seconday constructer create
    //we create secondary constructer useing consrtucters() keyword
    // we can call primary constructer using :this keyword

    constructor(name: String,enginType: String):this(name,4,4,enginType)
}


//
//1. Parameters
//Definition: Variables that are passed to functions, constructors, or lambdas.
//
//Scope: Available only within the function or constructor they belong to.
//
//Example (Function Parameters):
//
//kotlin
//Copy
//Edit
//fun greet(name: String) {
//    println("Hello, $name!")
//}
//
//greet("Alice")  // Output: Hello, Alice!
//Example (Constructor Parameters):
//
//kotlin
//Copy
//Edit
//class Person(name: String)  // `name` is a parameter, not a property!
//⚠️ Note: Constructor parameters are not automatically stored as properties unless explicitly declared as properties.
//
//2. Constructors
//Definition: Special functions used to initialize a class.
//
//Types: Kotlin has primary and secondary constructors.
//
//Example (Primary Constructor):
//
//kotlin
//Copy
//Edit
//class Person(val name: String, var age: Int)  // `name` and `age` become properties
//Example (Secondary Constructor):
//
//kotlin
//Copy
//Edit
//class Person {
//    var name: String
//    var age: Int
//
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//    }
//}
//3. Properties
//Definition: Variables that belong to a class and hold state.
//
//Scope: Available throughout the class.
//
//Types: val (immutable) or var (mutable).
//
//Example (Class Properties):
//
//kotlin
//Copy
//Edit
//class Person {
//    var name: String = "Unknown"  // Property
//    var age: Int = 0              // Property
//}
//Example (Auto-Generated Properties from Constructor Parameters):
//
//kotlin
//Copy
//Edit
//class Person(val name: String, var age: Int)  // `name` and `age` become properties
//Key Differences
//Feature	Parameters	Constructors	Properties
//Definition	Temporary variables passed to a function/constructor	Special function to initialize a class	Variables belonging to a class
//Scope	Limited to the function or constructor	Exists only during object initialization	Exists as long as the object is alive
//Persistence	Lost after function execution	Runs once per object creation	Stored in the class
//Example	fun add(a: Int, b: Int)	class Person(name: String)	var name: String = "John"
//Final Example: Using All Three
//kotlin
//Copy
//Edit
//class Person(val name: String, var age: Int) {  // Properties defined from constructor parameters
//    fun introduce(prefix: String) {  // Function with a parameter
//        println("$prefix My name is $name and I am $age years old.")
//    }
//}
//
//val person = Person("Alice", 25)  // Constructor call
//person.introduce("Hello!")  // Using parameter in function
//✅ Output:
//
//pgsql
//Copy
//Edit
//Hello! My name is Alice and I am 25 years old.

//https://chatgpt.com/c/67c17e9b-abec-8003-9bdd-346aa34c204d
