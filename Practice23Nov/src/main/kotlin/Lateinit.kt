class Calculator{
    lateinit var message : String
}

fun main(){
    val calculator = Calculator()
    calculator.message = "Hello"
    println(calculator.message)

}