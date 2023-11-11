import java.util.*

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        println()
        println("Menu")
        println("1: Fibonacci sequence")
        println("2: Calculate the factorial")
        println("3: List of prime numbers")
        println("4: Reverse a string")
        println("5: String or number is a palindrome")
        println("6: Union, Intersection, and Difference of two sets")
        println("7: Exit")
        println()
        print("Enter related number which program you like to run: ")
        val userInput = scanner.nextLine()
        when (userInput) {
            "1" -> {
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
            "2" -> {
                //Create a program to calculate the factorial of a number.
                println("Calculate the factorial: ")
                print("Enter a number: ")
                var number = scanner.nextInt()

                println("Calculate the factorial using recursive function:")
                println("The factorial of given number is: ${factorial(number)}")

                println("Calculate the factorial using loop:")
                var fact = 1
                while (number >=1){
                    fact *= number
                    number--
                }
                println("The factorial of given number is: $fact")

            }
            "3" -> {
                //Generate a list of prime numbers within a given range
                println("Prime numbers with in given range:")
                print("Enter first number: ")
                val firstNumber = scanner.nextInt()
                print("Enter second number: ")
                val secondNumber = scanner.nextInt()
                for (primeNumber in firstNumber .. secondNumber){
                    if (primeNumber%2 != 0){
                        print("$primeNumber ")
                    }
                }
            }
            "4" -> {

                //Create a program to reverse a given string.
                println("Reverse a given string: ")
                print("Enter as string: ")
                val string = scanner.nextLine()
                if (string!=null){
                    println("$string after reverse ${string.reversed()}")
                }else{
                    println(null)
                }
            }
            "5" -> {

                //Write a program to check if a given string or number is a palindrome.
                println("String or number is a palindrome:")

                val palindrome = "12321"
                if (palindrome.uppercase() == palindrome.reversed().uppercase()){
                    println("This is palindrome")
                }else{
                    println("Not a palindrome")
                }
            }
            "6" -> {

                // Write a program that performs set operations like union, intersection, and difference on two sets.
                val set1 = setOf(1,2,3,4)
                val  set2 = setOf(3,4,5,6)

                //Union
                val unionSets = set1.union(set2)
                println("Union of two sets is: $unionSets")

                //Intersection
                val intersectionSets = set1.intersect(set2)
                println("Intersection of two sets is: $intersectionSets")

                //Difference

                val differenceSets1 = set1.minus(set2)
                val differenceSets2 = set2.minus(set1)

                val differenceSets = differenceSets1.union(differenceSets2)

                println("Difference of two sets id: $differenceSets")
            }
            "7" -> {
                println("Exit")
                break
            }
            else -> {
                println("Invalid Number")
            }
        }
    }

}