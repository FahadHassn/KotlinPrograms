fun main(){

//    //nested class
//    val car = Car(make = "Toyota", model = "Camry", year = 2020)
//    println(car.getInfo())
//
//    val engine = car.Engine()
//    engine.horsepower = 250
//    engine.cylinders = 6
//
//    println(engine.getEngineInfo())

    //nested class with inner keyword

    val inner= OuterClass().InnerClass()
    // inner function call using object
    println(inner.nestFunction()+" property accessed successfully from inner class ")

}

//nested class
class Car(var make: String, var model: String, var year: Int){
    inner class Engine {
        var horsepower: Int = 0
        var cylinders: Int = 0

        fun getEngineInfo(): String {
            return "$horsepower horsepower, $cylinders cylinders, in a $make $model"
        }
    }

    fun getInfo(): String {
        return "$make $model, year $year"
    }
}

//nested class with inner keyword
class OuterClass {
    var str = "Outer class"
    inner class InnerClass {
        var s1 = "Inner class"
        fun nestFunction(): String {
            // can not access the outer class property str if you not use inner keyword with inner class
            val s2 = str
            return s2
        }
    }
}