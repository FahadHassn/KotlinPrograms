fun main(){

    val employee = Employee()
    employee.name = "Fahad"
    employee.age = 21

//    println(employee)
//    println(employee.name)
//    println(employee.age)

    //apply function

    employee.apply {
        name = "ABC"
        age = 22
    }

//    println(employee)

    //let function

    employee.let {
        println(it.name)
        println(it.age)
    }

    //let function with null check

//    val employee : Employee? = null
//    employee?.name = "Fahad"
//    employee?.age = 21
//
//    employee?.let {
//        it.name = "XYZ"
//        it.age = 23
//    }

    //with function

    with(employee){
        name = "Asif"
        age = 40
    }

    //run function

    employee.run {
        name = "Umer"
        age = 25
    }

    println(employee.name)
    println(employee.age)

}

data class Employee(var name: String = "" , var age: Int = 10)