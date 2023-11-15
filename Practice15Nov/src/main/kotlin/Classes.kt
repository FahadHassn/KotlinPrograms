private class Vehicle{

    //properties
    var make : String? = null
    var model : String? = null
    var type : String? = null
    var year : Int = 0

    //methods
    fun getInfo() : String{
        return "Make: $make\nModel: $model\nYear: $year"
    }
}

fun main(){

    val vehicle = Vehicle()
    vehicle.make = "Toyota"
    vehicle.model = "Camry"
    vehicle.type = "Car"
    vehicle.year  = 2022

    println(vehicle.getInfo())

}