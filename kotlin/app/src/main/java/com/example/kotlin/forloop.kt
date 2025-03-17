package com.example.kotlin

fun main () {
// default incerment +1
    for(i in 1..5){
        println(i)
        //op = 1
        //2
        //3
        //4
        //5
    }

    // if we want that it increses by 2 then we have to use step 2
    for (i in 1..5 step 2){
        print(i)
        //op 135
    }

    //until
    // if we use until if print between data of 1 to 5 like 2 3 4

    for(i in 1 until 5){
        println(i)
        //op 2
        //3
        //4
    }

    // if we want to print 10 to 1 like 10 9 8 7 6 5 4 3 2 1
    for(i in 10 downTo 1 ){
        println(i)
        //op 10
        //9
        //8
        //7
        //6
        //5
        //4
        //3
        //2
        //1
    }
}