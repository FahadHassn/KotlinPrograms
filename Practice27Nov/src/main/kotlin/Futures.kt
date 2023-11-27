import java.util.Scanner
import java.util.concurrent.CompletableFuture

fun main() {

    //future without Thread sleep
//    val future = CompletableFuture.supplyAsync {
//        "Result of the asynchronous operation"
//    }
//
//    future.thenAccept { result ->
//        println("Received result: $result")
//    }
//
//    future.join()
//    println("Complete!")

    //future with Thread sleep
    val future = CompletableFuture.supplyAsync {
        Thread.sleep(2000)
        "Result of the asynchronous operation"
    }

    future.thenAccept{ result ->
        println("Received result: $result")
    }

    println("Processing...")
    future.join()
    println("Complete!")

    //sum of two numbers using future
//    val scanner = Scanner(System.`in`)
//    print("Enter first number: ")
//    val userInput1 = scanner.nextInt()
//    print("Enter second number: ")
//    val userInput2 = scanner.nextInt()
//    var sum : Int
//
//    val future = CompletableFuture.supplyAsync{
//        Thread.sleep(2000)
//        sum = userInput1+userInput2
//        "Sum of $userInput1 and $userInput2 is : $sum"
//    }
//
//    future.thenAccept{result ->
//        println(result)
//    }
//
//    println("Processing...")
//    future.join()
//    println("Complete!")

    //two async operations in parallel and combine their results

//    val future1 = CompletableFuture.supplyAsync{
//        Thread.sleep(1000)
//        "Hello"
//    }
//    val future2 = CompletableFuture.supplyAsync{
//        Thread.sleep(1000)
//        "world!"
//    }
//
//    val combineFuture = future1.thenCombine(future2){result1, result2 ->
//        "$result1 $result2"
//    }
//
//    combineFuture.thenAccept{result ->
//        println("Async operation completed with result: $result")
//    }
//
//    println("Processing...")
//
//    combineFuture.join()
//
//    println("Finish")
}
