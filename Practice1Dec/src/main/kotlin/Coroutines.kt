import com.sun.org.apache.xpath.internal.operations.Mod
import kotlinx.coroutines.*

//import kotlinx.coroutines.*
////sampleStart
//fun main() = runBlocking { // this: CoroutineScope
//    launch { // launch a new coroutine and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//    }
//    println("Hello") // main coroutine continues while a previous one is delayed
//}
////sampleEnd

/*fun main() = runBlocking{

    launch {
        delay(2000L)
        println("Coroutine with global scope from thread ${Thread.currentThread().name}")
    }
    println("Main Thread from ${Thread.currentThread().name}")

    coroutineFunction()
}

fun coroutineFunction(){
    CoroutineScope(Dispatchers.Default).launch {
        delay(2000L)
        println("Coroutine with coroutine scope from thread ${Thread.currentThread().name}")
        withContext(Dispatchers.Main){
            println("Dispatcher Main...${Thread.currentThread().name}")
        }
    }

}*/


/*
fun main() = runBlocking{

        //Global Scope
//    val job = GlobalScope.launch {
//        repeat(5){
//            println("Coroutine is working $it")
//            delay(500)
//        }
//    }
//
//    println("Main thread is not blocked")
//    job.join()
//    println("Coroutine is done")

        //Coroutine Scope
//    coroutineScope {
//        launch {
//            performTask("Task 1")
//        }
//
//        launch {
//            performTask("Task 2")
//        }
//    }
//    println("Both tasks completed")
//
//    //Coroutine Scope
//    val c = CoroutineScope(Dispatchers.IO).launch {
//            println("Coroutine is working")
//    }
//
//    println("Main thread...")
//    c.join()
//    println("Coroutine Scope Complete")

    //Main Scope

//    val mainScope = MainScope().launch(Dispatchers.Default){
//        println("Main Scope: ${Thread.currentThread().name}")
//    }
//
//    println("Main thread...")
//    mainScope.join()
//    println("Main Scope Complete")

}

fun performTask(taskName: String) {
    Thread.sleep(1000)
    println("Completed $taskName")
}
*/

fun main() = runBlocking{

    var name: String = "Your name is"

//    launch(Dispatchers.IO) {
//        println(name)
//        val answer = doNetworkCall()
//        withContext(Dispatchers.IO){
//            name = answer
//            println(name)
//        }
//    }

    async {
        println(name)
        val answer = doNetworkCall()
        withContext(Dispatchers.IO){
            name = answer
            println(name)
        }
    }
    println("Main thread...")
}

suspend fun doNetworkCall() : String{
    delay(2000L)
    return "Fahad"
}