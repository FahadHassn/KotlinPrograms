
val pi: Double by lazy {
    3.1415 }

fun main() {

    //lazy
//    val area = pi * 4 * 4
//    println(area)

    //Delegates observable
//    var delegateObservable : Int by Delegates.observable(0){property, oldValue, newValue ->
//        println("Old value: $oldValue")
//        println("New value: $newValue")
//    }
//
//    delegateObservable = 12
//    delegateObservable = 14
//    println(delegateObservable)
//
//
//    //Delegate Vetoable
//    var delegatevetoable : Int by Delegates.vetoable(12){property, oldValue, newValue ->
//        println("Old value: $oldValue")
//        println("New value: $newValue")
//        newValue>30
//    }
//    delegatevetoable = 22
//    println(delegatevetoable)

}