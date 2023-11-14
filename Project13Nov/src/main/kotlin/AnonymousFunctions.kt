fun main(){

//    val sum = fun(x: Int , y: Int): Int{
//        return x+y
//    }
//    println("The sum of two number is: ${sum(3,4)}")
//
//    val multiply = fun(a: Int , b: Int): Int = a*b
//    println("The multiplication of two number is: ${multiply(2,5)}")

    var sum = 0
    val ints = listOf(1,2,3,-3-2-1)
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)

}