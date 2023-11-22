import java.util.Scanner

fun main(){

    val intContainer = Container<Int>(5)
    println(intContainer.getValue())

    val stringContainer = Container(0)
    println(stringContainer.getValue())

    val scanner = Scanner(System.`in`)
    print("Enter a value: ")
    val userInput = scanner.nextLine()
    val container = Container(userInput)
    println("Value is: ${container.getValue()}")

}

//Generics

//generics class

class Container<J>(var data: J){
    fun setValue(value : J){
        data = value
    }

    fun getValue() : J{
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
