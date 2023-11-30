
private var number : Int? = null
private var i = 0
fun main() {

    //let
//    if (number != null){
//        val number2 = number + 1
//        println(number2)
//    }

//    number?.let {
//        val number2 = it+1
//        println(number2)
//    }
//
//    number?.let {
//        val number2 = it+1
//        println(number2)
//    } ?: println(0)

    //also

//    getSquareI()

    //apply

    val person = Person()

    //without using apply
    person.name = "Ali"
    person.age = 30
    println(person.name)
    println(person.age)

    //using apply
    val person1 = Person().apply {
        name = "Fahad"
        age = 22
//        println(name)
//        println(age)
    }
    println(person1)

    //with
//    val person = Person()
//    with(person){
//        name = "lkjhg"
//        age = 34
//    }

    //run

//    val person : Person? = null
//    person?.name = "asd"
//    person?.age = 222
//    println(person)
//    person?.run {
//        name = "qwe"
//        age = 23
//    }
//    println(person)

}

fun getSquareI() = (i*i).also {
    i++
    println("The value i after using also: $i")
}

data class Person(var name: String = "Abc", var age: Int = 0)