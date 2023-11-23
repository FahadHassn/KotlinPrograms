import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter first number: ")
    val input1 = scanner.nextInt()
    print("Enter second number: ")
    val input2 = scanner.nextInt()

    val result = inlineFunction(input1,input2){x,y -> x+y}
    println("Result is: $result")

}


//simple inline function
//inline fun inlineFunction(a: Int, b: Int) : Int{
//    return a+b
//}

inline fun inlineFunction(a: Int, b: Int, operation: (Int,Int) -> Int) : Int{
    return operation(a,b)
}