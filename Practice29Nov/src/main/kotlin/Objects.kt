import java.util.Scanner

fun main() {

    //Companion object

    val employee = Employee()
    Employee.accessPrivateProperty(employee)

//    Employee.name = "Fahad"
//    Employee.age = 22
//    Employee.info()
//    Employee.accessPrivateProperty(employee = Employee())

    //Object
//    Employee.B.name = "Object Fahad"
//    Employee.B.age = 24
//    Employee.B.printB()

    //Singleton Object
//    val scanner = Scanner(System.`in`)
//    print("Enter first value: ")
//    Obj.value1 = scanner.nextInt()
//    print("Enter second value: ")
//    Obj.value2 = scanner.nextInt()
//    Obj.calculator()

    //Anonymous Object




}

private class Employee(){

    private val classProperty = "Class Private property"

    companion object A : Interface{
        var name: String? = null
        var age: Int? = null

        fun printA(){
            println(name)
            println(age)
        }

        fun accessPrivateProperty(employee: Employee){
            println("Accessing private property: ${employee.classProperty}")
        }

        override fun info() {
            printA()
        }
    }

    object B{
        var name: String? = null
        var age: Int? = null

        fun printB(){
            println(name)
            println(age)
        }

    }

}

object Obj{
    var value1: Int = 4
    var value2: Int = 4

    fun calculator(){
        println("Addition of $value1 and $value2 is: ${value1.plus(value2)}")
        println("Subtraction of $value1 and $value2 is: ${value1.minus(value2)}")
        println("Multiplication of $value1 and $value2 is: ${value1.times(value2)}")
        println("Division of $value1 and $value2 is: ${value1.div(value2)}")
    }

}

interface Interface{
    fun info()
}