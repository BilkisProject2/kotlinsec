package com.example.kotlin.scopedfun

fun main(){
    val emp = employee()
    emp.age= 23
    emp.name="Bilkis"
    println(emp)


    // when we have lot of fun in emp and we have to write emp.name etc then we can use emp keyword like this
    emp.apply {
        age = 24
        name= "sameera "
        println(emp)
    }

    //let
    //let use at time of print
    // it var return value is last expression ttype string int etc
    emp.let {
        println(it.age)
        println(it.name)
    }

    // the only diff between with and let is in let there is it in fun with is lambda and in with there is this with is nrmal fun
    with(emp) {
        age = 28
        name = "zafar "
    }

// run is combination of with and run
    emp.run {
        age = 29
        name = "sameer "
    }
}

data class employee(var name:String="", var age:Int = 18)