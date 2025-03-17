package com.example.kotlin

fun main(){
    // when we not crete any constructer then it create default constructes
    val ob = calculator()
    print(ob.add(27,43))
    persone("bilkis",20)
}

class calculator{
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }

}


//getter and setter

// on this way we set the value  set(value) {
//            if (value>0){
//                field=value
//            }
//        }

//main key is field
class  persone (name: String, age:Int){
    var name:String = name
    var age:Int=age

        get() = field

        set(value) {
            if (value>0){
                field=value
            }else{
                println("age")
            }
        }
}