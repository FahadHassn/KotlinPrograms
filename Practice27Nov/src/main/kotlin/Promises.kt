import java.util.Scanner
import java.util.concurrent.CompletableFuture

fun main() {

    val scanner = Scanner(System.`in`)
    print("Enter your Name: ")
    val userInput = scanner.nextLine()

    val promise = CompletableFuture<String>()
    Thread{
        Thread.sleep(1000)
        promise.complete("Hi, $userInput")
    }.start()

    promise.thenAccept{result ->
        println("Async operation completed with result: $result")
    }

    println("Processing...")

}