
//Class with primary constructor

class House(rooms: Int, washrooms: Int, kitchen: Int){

    private var houseRooms : Int = rooms
    private var houseWashrooms : Int = washrooms
    private var houseKitchen : Int = kitchen

    //initializer block
    init {
        println("House Detail:")
    }


    fun houseInfo(): String{
        return "No of rooms: $houseRooms\nNo of washrooms: $houseWashrooms\nNo of kitchen: $houseKitchen"
    }
}

//Class with secondary constructor
class Animal{

    private var animalName : String
    private var animalType : String
    private var animalAge : Int = 3

    constructor(name: String, type: String, age: Int) {
        this.animalName = name
        this.animalType = type
        this.animalAge = age
    }
    constructor(name: String, type: String){
        this.animalName = name
        this.animalType = type
    }

    fun animalInfo() : String{
        return "Animal name: $animalName\nAnimal type: $animalType\nAnimal age: $animalAge"
    }

}
//secondary constructor with/using primary constructor
class Car(make: String, model: String, type: String, year: Int, tyres: Int, seats: Int){

    private var vMake : String = make
    private var vModel : String = model
    private var vType : String = type
    private var vYear : Int = year

    constructor(vehicleMake: String, vehicleModel: String, vehicleType: String, vehicleYear: Int) : this(vehicleMake,vehicleModel,vehicleType,vehicleYear,4,5)

    fun carInfo() : String{
        return "Make: $vMake\nModel: $vModel\nType: $vType\nYear: $vYear"
    }
}

fun main(){

    //primary constructor
    val house = House(5,3,2)
    println(house.houseInfo())

    println()

    //secondary constructor with/using primary constructor
    println("Vehicle Detail:")
    val car = Car("Honda","City","Petrol",2022)
    println(car.carInfo())

    println()
    println("Animal Detail:")
    //secondary constructor
    val animal = Animal("Jezzi","Cat",4)
    println(animal.animalInfo())

}