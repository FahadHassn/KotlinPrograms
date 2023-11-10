fun main(){

    //List

    //immutable list

    val num = listOf(1,2,3,4,5,6)
    println(num[2])
    println("The index of 2 is ${num.indexOf(2)}")
    println(num.first())
    println(num.last())
    println(num.indexOf(4))
    println(num.size)
    println(num.contains(4))

    for (a in num){
        print(a)
    }
    println()

    //mutable list

    val alphabets = mutableListOf('A','B','C','D','E')
    alphabets.add('F')
    for (char in alphabets)
        print(char)

    println()

    val items = mutableListOf(10,11,12,13,14)
    items.add(17)
    items.remove(10)
    println(items.indexOf(13))
    items.set(4,15)
    for ((i, item) in items.withIndex())
        println("$i, $item")

    items.addAll(num)
    for (num11 in items)
        print(num11)

    //

}