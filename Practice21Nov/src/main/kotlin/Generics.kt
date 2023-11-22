import java.util.Scanner

fun main(){

    val intContainer = Container<Int>(5)
    println(intContainer.getValue())

    val stringContainer = Container<String>("Hello")
    println(stringContainer.getValue())

    val scanner = Scanner(System.`in`)
    print("Enter a value: ")
    val userInput = scanner.nextLine()
    val container = Container(userInput)
    println("Value is: ${container.getValue()}")

}

//Generics

//generics class

class Container<T>(var data: T){
    fun setValue(value : T){
        data = value
    }

    fun getValue() : T{
        return data
    }

}

//don't use generics

//class IntContainer(var data: Int){
//    fun setValue(value : Int){
//        data = value
//    }
//
//    fun getValue() : Int{
//        return data
//    }
//
//}class StringContainer(var data: String){
//    fun setValue(value : String){
//        data = value
//    }
//
//    fun getValue() : String{
//        return data
//    }
//
//}
