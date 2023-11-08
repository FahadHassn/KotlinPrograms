@file:Suppress("UNREACHABLE_CODE")

import org.jetbrains.annotations.Nullable

fun main(){

    //Non Nullable

//    var a : String = "abc"
//    //a = null //compilation error
//    println(a)
//
//    //Nullable
//
//    var b : String? = "Hello"
//    b = null
//    println(b)

    //Checking for null in conditions

    var str : String? = "Hello"
//    if (str!=null){
//        println("The length of the String is: ${str.length}")
//    }else{
//        println("The length of the String is: -1")
//    }




    if (str != null) {
        println(str.uppercase())
    }

    //safe call operator

    println(str?.uppercase())

//    str = null
//    if (str!=null) {
//        println(str.length)
//    } else println("The length of the String is: -1")


    //by default make null when I assign null value variable
    val abc = str

    //elvish operator

    val s = str ?: "NA"

    println(s)

    // not null asserted operator

    val v = str!!.length
    println(v)

}