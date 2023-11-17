fun main(){

    val propertiesClass = PropertiesClass(6,"Interface Properties")
    println("Integer value is: ${propertiesClass.a}")
    println("String value is: ${propertiesClass.b}")

}

interface PropertiesInterface {
    val a : Int
    val b : String
        get() = "Hello"
}

class PropertiesClass(integerValue: Int, stringValue: String) : PropertiesInterface {
    override val a : Int = integerValue
    override val b : String = stringValue
}