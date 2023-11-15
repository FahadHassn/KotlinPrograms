fun main(){

    val person = Person("Fahad",22)
    println(person.personName)
    println(person.personAge)
    person.personAge = -22

}

class Person(name : String, age: Int){

    var personName : String= name
        get(){
            return field.toUpperCase()
        }
    var personAge : Int = age
        set(value) {
            if (value>0){
                field = value
            }else{
                println("Age can't be negative")
            }
        }

}