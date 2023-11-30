fun main(){

//    val password = Password("Password...")
//    println("Password is: ${password.s}")

    //inline class with member

//    val person = Person("Fahad", "Hassan")
//    person.greet()
//    println(person.length)

    //inline class with inheritance

//    val name = Name("Fahad")
//    println(name.printName())

}

//inline class
@JvmInline
value class Password(val s: String)

//inline class with member
@JvmInline
value class Person(private val fullName: String){
    init {
        require (fullName.isNotEmpty()){
            "Full name shouldn't be empty"
        }
    }
    constructor(firstName: String, lastName: String) : this("$firstName $lastName"){
        require(lastName.isNotBlank()){
            "Last name shouldn't be empty"
        }
    }
    val length: Int
        get() = fullName.length

    fun greet(){
        println("Hello $fullName")
    }
}

//inline class with inheritance
interface Printable{
    fun printName() : String
}

@JvmInline
value class Name(private val n : String) : Printable{
    override fun printName(): String {
        return "Hi $n"
    }

}