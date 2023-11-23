import java.util.Scanner

fun main(){

    //extension function
//    val x = 10.add(20)
//    println(x)

    val scanner = Scanner(System.`in`)

    print("Enter first value: ")
    val a = scanner.nextInt()
    print("Enter second value: ")
    val b = scanner.nextInt()
    print("Enter third value: ")
    val c = scanner.nextInt()
    if ((a==b) and (b==c) and (c==a)){
        println("And")
    }
    else if ((a==b) or (b==c) or (c==a)){
        println("Or")
    }
    else if (a not b){
        println("Not")
    }
    else{
        println("Not match")
    }

    //infix notation / infix function
//    val x = 10 add 23
//    println(x)
//
//    val a = A()
//
//    //a.name("Fahad")
//    a name "Fahad"

//
//    println("Name is: ${a name "Fahad"}")

}

infix fun Int.not(b: Int): Boolean = this != b


//Extension function
//fun Int.add(a: Int) : Int = this + a

    //infix notation / infix function
infix fun Int.add(a: Int) : Int = this + a


class A{
    infix fun name(n: String) : String{
        return n
    }
}
