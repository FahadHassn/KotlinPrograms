typealias Calculation = (Int, Int) -> Int

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun performCalculation(calculation: Calculation, x: Int, y: Int): Int {
    return calculation(x, y)
}

fun main() {
    val sum: Calculation = ::add
    val difference: Calculation = ::subtract

    println(performCalculation(sum, 5, 3))
    println(performCalculation(difference, 5, 3))
}