package com.example.kotlin.objects

fun main(){
    sharingwidget.display()


    //object experiences
    //anonymous var testobj = object {} like this object {}  there we not give name
    var testobj = object {
        var x :Int = 10
        fun method(){
            println("I am object expression")
        }
    }
    println(testobj.method())

    //anonymous interface
    var obj = object :cloneable{
        override fun clonr() {
            TODO("Not yet implemented")
        }

    }

}

//object decaraltion
object sharingwidget{
   private var twitterlkes = 0
    private var fblike=0
    fun incrementtwitterlikes()= twitterlkes++
    fun incrementfackbooklike()= fblike++
    fun display()= println("facebook - $fblike and twitter - $twitterlkes")
}

interface cloneable{
    fun clonr()
}

//object experiences
//anoymous obj using object keyword
//replacement of java anonymous inner class
