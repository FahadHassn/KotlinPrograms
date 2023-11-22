import java.lang.Exception
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    //try catch and finally

    val list = arrayOf(1,2,3)
    print("Enter index which value you want check: ")
    val userListInput = scanner.nextInt()
    try {
        println(list[userListInput])
    }catch (e: Exception){
        println("Invalid index")
    }finally {
        println("finally block always executes")
    }

    // throw

    print("Enter your age: ")
    val userInput = scanner.nextInt()
    validate(userInput)
    println("code after validation check...")
}

//throw keyword
fun validate(age: Int) {
    if (age < 18 || age > 60)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}