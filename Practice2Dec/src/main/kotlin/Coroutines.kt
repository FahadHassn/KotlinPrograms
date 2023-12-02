import kotlinx.coroutines.*

fun main() {

//    //Using launch coroutine builder
//    val job = CoroutineScope(Dispatchers.Default).launch {
//        println("Launching coroutine in ${Thread.currentThread().name}")
//        val result = fetchData()
//        println("Using launch received result: $result")
//    }
//
//    runBlocking {
//        job.join()
//    }

//    //Using async coroutine builder
//    val defaultResult = CoroutineScope(Dispatchers.Default).async {
//        println("Launching coroutine in ${Thread.currentThread().name}")
//        val result = fetchData()
//        result
//    }
//
//    runBlocking {
//        val result = defaultResult.await()
//        println("Using async received result: $result")
//    }

//    //Working with different coroutines context
//    val coroutineContext = CoroutineScope(Dispatchers.Default).launch {
//        println("Main coroutine in ${Thread.currentThread().name}")
//        withContext(Dispatchers.IO){
//            val result = fetchData()
//            println("IO coroutine in ${Thread.currentThread().name}. Received result: $result")
//        }
//        println("Back to Main coroutine ${Thread.currentThread().name}")
//    }
//
//    runBlocking {
//        coroutineContext.join()
//    }

    //Parallel execution using async/await
    println("Main thread: ${Thread.currentThread().name}")

    val deferredResult1 = CoroutineScope(Dispatchers.Default).async {
        delay(2000L)
        "Result 1"
    }

    val deferredResult2 = CoroutineScope(Dispatchers.Default).async {
        delay(2000L)
        "Result 2"
    }

    runBlocking {
        val result1 = deferredResult1.await()
        val result2 = deferredResult2.await()

        val combineResult = "Combine Result: $result1, $result2"
        println(combineResult)
    }

    //Launch coroutine for non-blocking operation
    var job = CoroutineScope(Dispatchers.Default).launch {
        performNonBlockingOperation()
    }

    runBlocking {
        job.join()
    }

    println("Main thread end")

}

suspend fun fetchData(): String{
    delay(1000L)
    return "Data from the network"
}

suspend fun performNonBlockingOperation() {
    println("Performing non-blocking operations in ${Thread.currentThread().name}")
    delay(1000)
    println("Non blocking operations complete")
}
