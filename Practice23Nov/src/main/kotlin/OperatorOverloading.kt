fun main(){

    //Unary Operator
//    val obj = UnaryOverload("Hello")
//    println("Initial string is: ${obj.str}")
//
//    //obj.unaryMinus()
//
//    //use operator overloading we call this function like this
//    -obj
//    println("String after applying unary operator ${obj.str}")


    //Binary Operators
    val obj = Object("Chair")

    //obj.plus(9)
    obj+9

    println(obj)

}

    //Unary Operators
class UnaryOverload(var str: String){
    operator fun unaryMinus(){
        str = str.reversed()
    }
}

    //Binary Operators

class Object(var objName: String){
    operator fun plus(data: Int){
        objName = "Name is $objName and data is $data"
    }

    override fun toString(): String {
        return objName
    }
}
