fun main(){

    //Simple Interface
    val car = Car()
    car.start()
    car.stop()

}

//Simple Interface
interface Vehicle{
    fun start()
    fun stop()
}

class Car() : Vehicle{
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

}

interface Interface{
    fun firstMethod1()
    fun firstMethod2()
}

open class ParentClass() : Interface{
    override fun firstMethod1() {
        TODO("Not yet implemented")
    }

    override fun firstMethod2() {
        TODO("Not yet implemented")
    }

}

class ChildClass : ParentClass(){
    override fun firstMethod1() {
        super.firstMethod1()
    }

    override fun firstMethod2() {
        super.firstMethod2()
    }
}






