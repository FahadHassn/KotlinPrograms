fun main(){

//    val day =Day.Sunday
//    day.printFormattedDay()
//
//    //entities
//    val entities = Day.entries
//    println(entities)

//    //use in loop
//    for (i in Day.entries){
//        println(i)
//    }

//    //enum with constructor
//    val color = Cards.Diamond.color
//    println(color)

    //enum with anonymous function
    Seasons.Winter.foo()

}
enum class Day(){

    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

    fun printFormattedDay(){
        println("Today is: $this")
    }
}

//enum with constructor
enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red"),
}

//enum as anonymous function


// defining enum class
enum class Seasons(var weather: String) {
    Summer("hot"){
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter("cold"){
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate"){
        override fun foo() {
            println("Rainy days of a year")
        }
    };
    abstract fun foo()
}