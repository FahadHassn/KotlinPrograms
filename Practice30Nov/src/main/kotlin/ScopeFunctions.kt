import java.lang.StringBuilder

var number : Int? = null

fun main() {

    // TODO: let

//    val x = number?.let {
//        val number2 = it + 1
//        println(number2)
//    }

    // TODO: with

//    //Basic Usage
//    val personInfo = PersonInfo()
//    with(personInfo){
//        name = "Fahad"
//        age = 22
//    }
//    println("Name: ${personInfo.name}, Age: ${personInfo.age}")
//
//    //Returning a result
//    val point = Point(10,20)
//    val result = with(point){
//        x += 5
//        y -= 10
//        "x = $x and y = $y"
//    }
//    println("Modified Point: $result")
//
//    //working with collections
//    val numbers = mutableListOf(1,2,3,4,5)
//    with(numbers){
//        add(6)
//        add(7)
//        remove(3)
//    }
//    println("Modified List: $numbers")
//
//    //creating a StringBuilder
//    val stringBuilder = buildString()
//    println(stringBuilder)

    // TODO: apply

//    //Basic Usage
//    val personInfo = PersonInfo().apply{
//        name = "Fahad"
//        age = 22
//    }
//    println("Name: ${personInfo.name}, Age: ${personInfo.age}")
//
//    //Returning a result
//    val point = Point(10,20)
//    val result = point.apply{
//        x += 5
//        y -= 10
//        "x = $x and y = $y"
//    }
//    println("Modified Point: $result")
//
//    //working with collections
//    val numbers = mutableListOf(1,2,3,4,5).apply{
//        add(6)
//        add(7)
//        remove(3)
//    }
//    println("Modified List: $numbers")

    // TODO: run

//    val person = configurePerson()
//    println(person)
//
//    //run with list
//    val resultList = manipulateList()
//    println(resultList)

    // TODO: also

    val numberList = mutableListOf(1,2,3)
    val duplicateNumbersList = numberList.also {
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list element after removing an element: $it")
    }

    println("Original numbers: $numberList")
    println("Duplicate numbers: $duplicateNumbersList")

}

class PersonInfo(){
    var name: String = ""
    var age: Int = 0
}

data class Point(var x: Int, var y: Int)

fun buildString(): String{
    return with(StringBuilder()){
        append("Hello, ")
        append("Kotlin!")
        toString()
    }
}

data class Person(var name: String = "", var age: Int = 0)

fun configurePerson() : Person{
    return Person().run {
        name = "Hassan"
        age = 20
        this
    }
}

fun manipulateList(): List<String> {
    return mutableListOf<String>().run {
        add("Kotlin")
        add("is")
        add("programming")
        add("language")
        toList()
    }
}