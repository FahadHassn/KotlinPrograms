fun main(){

    //normal function

    println(upperCaseString("Hi, there"))

    //lambda expression

    println({string : String -> string.uppercase()} ("Hello"))

    //assign to a variable

    val lowerCaseString = { string : String -> string.lowercase()}
    println("The lowercase is: ${lowerCaseString("Hello")}")

    //val sum = {a: Int , b: Int -> a+b}

    val sum : (Int,Int) -> Int = {a,b -> a+b}
    println("The sum of a and b is: ${sum(3, 4)}")

    //pass lambda expression as a parameter to another function

    val numbers = listOf(1,-2,3,-4,5,-6)
    println("Numbers: $numbers")

    //example 1 using filter() function
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println("Positive numbers is: $positives")
    println("Negative numbers is: $negatives")

    //example 2 using map
    val double = numbers.map { y -> y*2 }
    val triple = numbers.map { y -> y*3 }
    println("Double: $double")
    println("Triple: $triple")

    //return a lambda expression

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    //invoke a lambda expression on its own

    println({ string: String -> string.uppercase() }("Hahaha"))

    //trailing lambda

    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))

    //another form of trailing lambda

    println(listOf(1,2,3).fold(0) { x, item -> x + item })

//    completion = {
//        println(it)
//    }

}
//lateinit var completion:(String)->Unit

  //normal function
fun upperCaseString(string: String) : String{
    return string.uppercase()
}

//return a lambda expression

fun toSeconds(time: String): (Int) -> Int = when(time){
    "hour" -> {value -> value * 60 * 60}
    "minute" -> { value -> value * 60 }
    "seconds" -> {value -> value}
    else -> {value -> value}
}