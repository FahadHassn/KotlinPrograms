fun main(){

//    val person = Person()
//    println("First name is: ${person.firstName}")
//    println("Last name is: ${person.lastName}")
//    println("Full name is: ${person.name}")

    //With constructor

    val person = Person("Fahad","Hassan")
    println("First name is: ${person.firstName}")
    println("Last name is: ${person.lastName}")
    println("Full name is: ${person.name}")


}

interface Named {
    val name: String
}
interface FullName : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

//class Person() : FullName{
//    override val firstName: String
//        get() = "Fahad"
//    override val lastName: String
//        get() = "Hassan"
//
//}

class Person(override val firstName: String, override val lastName: String) : FullName