fun main() {

    //Delegation
//    val electricEngine = ElectricEngine()
//    electricEngine.start()
//
//    val car = Car(electricEngine)
//    car.start()
//
//    Car(electricEngine).start()

    //

    val dogSound = DogSound()
    Animal(dogSound).makeSound()

}

    //Delegation
interface Engine {
    fun start()
    fun stop()

    fun running(){
        println("Running")
    }
}

class ElectricEngine : Engine {
    override fun start() {
        println("Electric engine started")
    }

    override fun stop() {
        println("Electric engine stopped")
    }
}
class Car(private val engine: Engine) : Engine by engine{
//    override fun start() {
//        println("Car engine started")
//    }

}

interface Sound{
    fun makeSound()
}
class DogSound : Sound{
    override fun makeSound() {
        println("Woof! Woof! ")
    }
}
class Animal(sound: Sound) : Sound by sound

