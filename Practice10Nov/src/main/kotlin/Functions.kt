import kotlin.math.min

fun main(){

//    additionWithoutParameters()
//    println(additionWithParameters(10,20))
//
//    println("The subtraction of default arguments is: ${defaultArgumentsAddition()}")
//    println(defaultArgumentsAddition(20,12))
//
//    printMessageWithNamedArgument(message = "Hello", prefix = "Log")
//    namedArgumentsWithDefaultValue()
//    namedArgumentsWithDefaultValue(name = "Hamza", age = 23)
//    namedArgumentsWithDefaultValue(age = 23, name = "Umer")
//    namedArgumentsWithDefaultValue(name = "Hassan")
//    namedArgumentsWithDefaultValue(age = 24)

    foo(strings = arrayOf("A","B","C","D"))
    printHello(null)

}

fun additionWithoutParameters(){
    val x = 11
    val y = 20
    println("Sum of x and y is: ${x+y}")
}

//return type

fun additionWithParameters(x: Int , y: Int) : Int{
    return x+y
}

  //Default Arguments
fun defaultArgumentsAddition(a: Int = 10 , b: Int = 5) : Int{
    return a-b
}

  //Named Arguments
fun printMessageWithNamedArgument(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun namedArgumentsWithDefaultValue(name: String = "Fahad", age: Int = 22){
    println("Name: $name \nAge: $age")
}


fun foo(vararg strings: String){
    for (string in strings){
        print("$string ")
    }
    println()
}


  //Function without return / unit returning functions
fun printHello(name: String?) : Unit{
    if (name != null){
        println(name)
    }else{
        println("Hi, there")
    }
}

fun printName(info: String?){
    if (info != null){
        println(info)
    }else{
        println("Hello")
    }
}

  //Single Expression function

fun sum(a : Int , b: Int) : Int = a+b

 //explicitly return type is optional

fun multiply(x: Int) = x*2  //same as above single expression function above
