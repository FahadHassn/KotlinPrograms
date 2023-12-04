import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun fetchData(): String{
    delay(1000L)
    return "Data fetched!"
}

fun main() {

    println("Coroutine start...")

    runBlocking {
        val result = async { fetchData() }
        println(result.await())
    }

    println("Coroutine end")

}