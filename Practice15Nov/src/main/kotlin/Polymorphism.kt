fun main(){

    val circle : Circle = Circle(4.0)
    val square : Square = Square(5.0)

//    val circle :Shape = Circle(4.0)
//    val square :Shape = Square(5.0)
//
    println(circle.area())
    println(square.area())

    val shapes = arrayOf(Circle(3.0),Circle(4.0),Square(5.0))
    println(shapes)

}

fun calculateArea(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() : Double{
        return 0.0
    }
}
class Circle(val radius: Double): Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Square(val side: Double): Shape(){
    override fun area(): Double {
        return side*side
    }
}