fun main(){
    val a : Array<Int> = arrayOf(1,2,3,4,5)
    val b = arrayOf('A','B','C','D')

    println("The Int array size is ${a.size}")

    b[3] ='A'
    b[2] ='B'
    b[1] ='C'
    b[0] ='D'

    println(a[3])
    println(a[2])

    println(b[0])
    println(b[1])
    println(b[2])
    println(b[3])

    b[3] ='D'
    b[2] ='C'
    b[1] ='B'
    b[0] ='A'

    print(b[0])
    print(b[1])
    print(b[2])
    print(b[3])
    println()

    // Array Constructor

    val num = Array(10 , { i -> i * 1 })
    for (item in num){
        print(item)

    }
}
