import java.util.Scanner

fun main(){

//    //for loop
//
//    val num = arrayOf(10,20,30,40,50)
//    for (item in num){
//        print("$item ")
//    }
//
//    println()
//
//    val marks = arrayOf(60,70,80,90)
//    for (numbers in marks.indices){  // indices = index
//        println("marks[$numbers]: "+marks[numbers])
//    }
//
//    val cakes = arrayOf("carrot", "cheese", "chocolate")
//    for (names in cakes)  //if the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.
//        println("Yummy! $names cake")


//    //while loop
//
//    var f = 1
//    while (f<=5){
//        println(f)
//        f++
//    }

//    // do while loop
//
//    var h = 5
//    do {
//        println("Hello")
//        h++
//    }while (h<5)

//    val x=5
//    var m =0
//    while (m<x){
//        var n = x
//        while (n>m){
//            print("*")
//            n--
//        }
//        m++
//        println()
//    }
//
//    val y = 5
//    var t = 0
//
//    while (t<y){
//        var u = 0
//        while (u<=t){
//            print("*")
//            u++
//        }
//        t++
//        println()
//    }

    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }

    println()

    for (i in 1..5){
        for (j in 5 downTo i){
            print("*")
        }
        println()
    }


    val scanner = Scanner(System.`in`)

    print("Enter any number: ")
    val y = scanner.nextInt()
    var t = 0
    while (t<y){
        var u = 0
        while (u<=t){
            print("*")
            u++
        }
        t++
        println()
    }

    println()

    print("Enter any number: ")
    val x = scanner.nextInt()
    var m = 0
    while (m<=x){
        var n = x
        while (n>m){
            print("*")
            n--
        }
        m++
        println()
    }

//    val number = arrayOf(0,1,2,3,4,5,6,7,8,9)
//    for (digits in number){
//        var i =0
//            while (i<=item){
//                print(item)
//                i++
//            }
//        println()
//    }
//
//    for (digits1 in  number.reversedArray()){
//        var j =0
//        while (j<=item){
//            print(item)
//            j++
//        }
//        println()
//    }
}