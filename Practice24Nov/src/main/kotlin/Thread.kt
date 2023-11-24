fun main() {
    val myThread = Thread(Runnable {
        println("Thread start")
        Thread.sleep(5000)
        println("Thread completed")
    })
    myThread.start()

}