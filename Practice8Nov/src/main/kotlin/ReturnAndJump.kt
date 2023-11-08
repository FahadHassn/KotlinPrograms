fun main(){

    //break

//    for (i in 1..3){
//        for (j in 1..3){
//            if (i==2){
//                break
//            }
//            println("i = $i and j = $j")
//        }
//    }
//
//    loop@ for (i in 1..3){
//        for (j in 1..3){
//            if (i==2){
//                break@loop
//            }
//            println("i = $i and j = $j")
//        }
//    }

    //continue statement

//    for (i in 1..3) {
//        println("i = $i")
//        if (i == 2) {
//            continue
//        }
//        println("this is below if")
//    }
//
//    labelname@ for (i in 1..3) {
//        for (j in 1..3) {
//            println("i = $i and j = $j")
//            if (i == 2) {
//                continue@labelname
//            }
//            println("this is below if")
//        }
//    }

    //return

    foo()

}

private fun foo() {

    val num = arrayOf(1, 2, 3, 4, 5)
    for (items in num){
        if (items == 3) return // non-local return directly to the caller of foo()
        println(items)
    }

}