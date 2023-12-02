fun main() {

    val properties = DeclarePropertyWithoutInitialize()
    properties.property = "Property initialize"
    println("Property: ${properties.property}")
    println("Property1: ${properties.property1}")
    println("Property2: ${properties.property2}")

}

class DeclarePropertyWithoutInitialize {

    lateinit var property: String

    val property1: String
    init {
        property1 = "Property1 initialize"
    }

    init {
        println("Declare Properties Without Initializing\n")
    }

    val property2: Int
        get() = 4 * 7

}

//fun main() {
//    print("Enter your name: ")
//    val name = readLine()
//    println("Hello, ${name?.capitalize()}! Welcome to Kotlin.")
//}