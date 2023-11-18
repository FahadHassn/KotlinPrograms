fun main(){

//    //sealed class
//    val demoA = Demo.A()
//    demoA.display()
//    val demoB = Demo.B()
//    demoB.display()

    //sealed class using when

    val fruit1 = Fruit.Apple()
    val fruit2 = Fruit.Mango()
    val fruit3 = Pomegranate()

    display(fruit1)
    display(fruit2)
    display(fruit3)

}

//sealed Class
sealed class Demo{
    class A : Demo(){
        fun display(){
            println("Subclass A of Sealed class Demo")
        }
    }
    class B : Demo(){
        fun display(){
            println("Subclass B of Sealed class Demo")
        }
    }
}

//sealed class with when

sealed class Fruit(val x : String)
{
    // Two subclasses of sealed class defined within
    class Apple: Fruit("Apple")
    class Mango: Fruit("Mango")

}

// A subclass defined outside the sealed class
class Pomegranate: Fruit("Pomegranate")

fun display(fruit: Fruit)
{
    when(fruit)
    {
        is Fruit.Apple -> println("${fruit.x} is good")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is tasty")
    }
}