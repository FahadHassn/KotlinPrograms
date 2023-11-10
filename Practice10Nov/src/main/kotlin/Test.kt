import java.util.Scanner
fun main() {

    val scanner = Scanner(System.`in`)
    println("1: Fibonacci sequence")
    println("2: Calculate the factorial")
    println("3: List of prime numbers")
    println("4: Reverse a string")
    println("5: String or number is a palindrome")
    println("6: Union, Intersection, and Difference of two sets")
    println("7: Exit")
    print("Enter related number which program you like to run: ")
    val userInput = scanner.nextInt()

        when (userInput) {
            1 -> {
                //Write a program to generate the Fibonacci sequence up to a given number of terms.
                println("Fibonacci sequence:")
                var a = 0
                var b = 1
                for (numbers in 0..10){
                    val c = a+b
                    print("$c ")
                    a=b
                    b=c
                }
            }
            2 -> {

                //Create a program to calculate the factorial of a number.
                println("Calculate the factorial:")
                println("The factorial of given number is: ${factorial(5)}")
            }
            3 -> {

                //Generate a list of prime numbers within a given range
                println("Prime numbers:")
                for (primeNumber in 0 .. 20){
                    if (primeNumber%2 != 0){
                        print("$primeNumber ")
                    }
                }
            }
            4 -> {

                //Create a program to reverse a given string.
                println("Reverse a given string: ")
                val string = "Hello"
                println("$string after reverse ${string.reversed()}")

            }
            5 -> {

                //Write a program to check if a given string or number is a palindrome.
                println("String or number is a palindrome:")

                val palindrome = "12321"
                if (palindrome.uppercase() == palindrome.reversed().uppercase()){
                    println("This is palindrome")
                }else{
                    println("Not a palindrome")
                }
            }
            6 -> {

                // Write a program that performs set operations like union, intersection, and difference on two sets.
                val set1 = setOf(1,2,3,4)
                val  set2 = setOf(3,4,5,6)

                //Union
                val unionSets = set1.union(set2)
                println("Union of two sets: $unionSets")

                //Intersection
                val intersectionSets = set1.intersect(set2)
                println("Intersection of two sets: $intersectionSets")

                //Difference

                val differenceSets1 = set1.minus(set2)
                val differenceSets2 = set2.minus(set1)

                val differenceSets = differenceSets1.union(differenceSets2)

                println(differenceSets)
            }
            7 -> {
                println("Exit")
            }
            else -> {
                println("Invalid Number")
            }
        }







//
//    //Write a program to generate the Fibonacci sequence up to a given number of terms.
//
//    println("Fibonacci sequence:")
//    var a = 0
//    var b = 1
//    for (numbers in 0..10){
//        val c = a+b
//        print("$c ")
//        a=b
//        b=c
//    }
//
//    println()
//
//    //Create a program to calculate the factorial of a number.
//
//    println("Calculate the factorial:")
//    println("The factorial of given number is: ${factorial(5)}")
//
//    //Generate a list of prime numbers within a given range
//
//    println("Prime numbers:")
//    for (primeNumber in 0  20){
//        if (primeNumber%2 != 0){
//            print("$primeNumber ")
//        }
//    }
//
//    println()
//
//    //Create a program to reverse a given string.
//
//    println("Reverse a given string: ")
//    val string = "Hello"
//    println("$string after reverse ${string.reversed()}")
//
//    //Write a program to check if a given string or number is a palindrome.
//    println("String or number is a palindrome:")
//
//    val palindrome = "12321"
//    if (palindrome.uppercase() == palindrome.reversed().uppercase()){
//        println("This is palindrome")
//    }else{
//        println("Not a palindrome")
//    }
//
//    // Write a program that performs set operations like union, intersection, and difference on two sets.
//
//    val set1 = setOf(1,2,3,4)
//    val  set2 = setOf(3,4,5,6)
//
//    //Union
//    val unionSets = set1.union(set2)
//    println("Union of two sets: $unionSets")
//
//    //Intersection
//    val intersectionSets = set1.intersect(set2)
//    println("Intersection of two sets: $intersectionSets")
//
//    //Difference
//
//    val differenceSets1 = set1.minus(set2)
//    val differenceSets2 = set2.minus(set1)
//
//    val differenceSets = differenceSets1.union(differenceSets2)
//
//    println(differenceSets)

}

fun factorial(fact : Int): Long {
    return if (fact==1) 1 else{
        fact*factorial(fact-1)
    }
}