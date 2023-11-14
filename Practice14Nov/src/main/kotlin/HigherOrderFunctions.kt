var extTest = ""
fun main(){

    //how to pass function to the variable

//    val passFunctionVariable = :: info
//    passFunctionVariable("Fahad",23)
//
//    //higher order function
//
//    val minus = {a:Int,b:Int -> a-b}
//    highOrderFun(minus)
//
//    val orgInfo = {name:String,website:String-> "Organization name is: $name\nOrganization website is: $website"}
//    organizationInfo(orgInfo)

    //also do this
    val ss = 5
    ss.sumOf3(40, 2)
    //calculator(3,5){ x, y -> x+y}

    calculator(3,5,::sumFunction)

}
fun Int.sumOf3(int: Int , t:Int){
   this+int+t
}


fun highOrderFun(min: (Int,Int) -> Int){
    val result = min(10,5)
    println("The subtraction of two number is: $result")

}

fun calculator(a: Int, b: Int, sum: (Int, Int) -> Int){
    val ab = a*b
    val result = sum(a, b)

    println("After multiplication the value of first two number is: $ab")
    println("The value of function is: $result")
}

fun sumFunction(value1: Int, value2: Int) : Int{
    println("The sum is: ${value1+value2}")
    return value1+value2
}

fun info(name: String, age: Int){
    println("Name is: $name\nAge is: $age")
}

fun organizationInfo(organization: (String,String) -> String){
    val org = organization("Mobizion","https://mobizion.com")
    println(org)
}