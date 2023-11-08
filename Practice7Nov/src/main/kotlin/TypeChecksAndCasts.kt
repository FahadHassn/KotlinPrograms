import java.util.Scanner

fun main(){

    //Smart Cast
    //is and !is

//    val scanner = Scanner(System.`in`)
//    print("Write something like your name,city or anything: ")
//    val obj = scanner.nextLine()
//
//    if (obj is String){
//        println(obj.length)
//    }
//
//    if (obj !is String){
//        println("Not a string")
//    }else{
//        println(obj.length)
//    }

    demo(8)

    //Unsafe and safe cast
    //as and as?

    //unsafe cast operator "as"

//    val obj : Any? = null
//    val str : String = obj as String //exception: null cannot be cast to non-null type kotlin.String
//    println(str)

//    val abc : Any = 123
//    val ed :String = abc as String // exception: class java.lang.Integer cannot be cast to class java.lang.String
//    println(ed)

//    val f : String? = "String unsafe cast"
//    val d : String? = f as String?
//    println(d)

    //safe cast operator "as?"

    val location : Any = "Lahore"
    val safeString : String? = location as? String
    val safeInt : Int? = location as? Int
    println(safeString)
    println(safeInt)

}

fun demo(x : Any){

//    if (x is String && x.length>0){
//        println(x.length)
//    }
//
//    if (x !is String) return

    //println(x.length)

//    when (x) {
//        is Int -> print(x + 1)
//        is String -> print(x.length + 1)
//        is IntArray -> print(x.sum())
//    }

}