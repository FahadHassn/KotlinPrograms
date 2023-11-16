fun main(){

    //Employee and Engineer

//    val eng = Engineer("Fahad",2)
//    eng.employeeDetails()
//    eng.dateOfBirth("20 December 2000")
//
//    //LivingThings and Dogs
//
    val lt = LivingThings()
    lt.breathe("LivingThings")
    val d = Dog()
    d.breathe("Dog")

    //calculator and its derived class
//
//    val addition = Add()
//    val add = addition.cal(4, 6)
//    println("Addition of two numbers $add")
//    val subtraction= Sub()
//    val sub = subtraction.cal(10,6)
//    println("Subtraction of two numbers $sub")
//    val multiplication = Mul()
//    val mul = multiplication.cal(20,6)
//    println("Multiplication of two numbers $mul")

}

//abstract class
abstract class Employee(val name: String,val experience: Int) {

    // Abstract Property
    abstract var salary: Double

    // Abstract Method
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}
class Engineer(name: String,experience: Int) : Employee(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}


//Abstract class extends opens class and override its method and make override method abstract
open class LivingThings {
    open fun breathe(msg: String) {
        println(msg)
    }
}
abstract class Animal : LivingThings() {
    abstract override fun breathe(msg: String)
}
class Dog: Animal(){

    override fun breathe(msg: String) {

    }
}

//abstract class can be overridden in all the derived classes

abstract class Calculator {
    abstract fun cal(x: Int, y: Int) : Int
}
// addition of two numbers
class Add : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
}
// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}
// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}

