fun main(){

    val firstClass = FirstClass()
    firstClass.add(5)
    firstClass.add(11,7)
    firstClass.print()

}

interface FirstInterface{
    fun add(a: Int, b: Int = 5)
    fun print()
    {
        println("This is a default method defined in the interface")
    }
}
class FirstClass : FirstInterface{
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("Sum is: $x")
    }

    override fun print() {
        super.print()
    }

}