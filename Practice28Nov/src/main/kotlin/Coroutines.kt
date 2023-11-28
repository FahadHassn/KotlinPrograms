import kotlinx.coroutines.*
fun main() = runBlocking{

    //Scopes

//    //Global Scope
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
//
//
//    //Coroutine Scope
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
//
//    //Main Scope
//
//    val mainScope = MainScope().launch(Dispatchers.Default){
//        println("Main Scope: ${Thread.currentThread().name}")
//    }
//
//    println("Main thread...")
//    mainScope.join()
//    println("Main Scope Complete")

    //Dispatcher

//    println("Main thread: ${Thread.currentThread().name}")
//
//    launch(Dispatchers.Default){
//        println("Default Dispatcher")
//    }
//
//    launch(Dispatchers.IO){
//        println("IO Dispatcher")
//    }
//
////    launch(Dispatchers.Main){
////        print("Main Dispatcher")
////    }
//
//    launch(Dispatchers.Unconfined){
//        println("Unconfined Dispatcher")
//    }
//
//    launch(newSingleThreadContext("My Own Thread")){
//        println("Custom Dispatcher")
//    }
//
//    delay(1000)

    //Suspended functions

    CoroutineScope(Dispatchers.Default).launch {
        task1()
    }

    CoroutineScope(Dispatchers.Default).launch {
        task2()
    }

    println("Coroutines: ")
}

fun performTask(taskName: String) {
    Thread.sleep(1000)
    println("Completed $taskName")
}


//suspended functions

suspend fun task1(){
    println("Starting task 1")
    yield()
    //delay(1000)
    println("Ending task 1")
}
suspend fun task2(){
    println("Starting task 2")
    yield()
    //delay(1000)
    println("Ending task 2")
}