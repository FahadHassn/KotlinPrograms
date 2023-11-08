import java.util.Scanner

fun main() {

    var a = 2
    var b = 6

    a += 7
    b += 5
    a -= 3
    a *= 3

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)

    if (a>b){
        println("a is greater then b")
    }else{
        println("a is less then b")
    }

    val scanner = Scanner(System.`in`)

    print("If you visit our menu enter 1 otherwise enter 0: ")
    val userInput = scanner.nextInt()
    when (userInput) {
        1 -> {
            println("Menu")
            println("2: Fast Food")
            println("3: Rice")
            println("4: Bar B Q")
            println("5: Drinks")
            println("6: Exit")
            print("Enter related number which thing you want: ")
            val menuInput = scanner.nextInt()
            when (menuInput) {
                2 -> {
                    println("Burger                    450")
                    println("Pizza                     2100")
                    println("Sandwich                  300")
                    println("Shawarma                  350")
                }

                3 -> {
                    println("Plain rice                100")
                    println("Biryani                   550")
                    println("Vegetable rice            2100")
                    println("Chicken fried rice        300")
                }

                4 -> {
                    println("Chicken Kabab             170")
                    println("Beef Kabab                550")
                    println("Mutton Kabab              2000")
                    println("Chicken Tikka             300")
                    println("Malai Tikka Boti          450")
                    println("Chicken Karahi            1700")
                    println("Chicken Handi             1600")
                    println("Mutton Karahi             3400")
                    println("Mutton Handi              3300")
                    println("Salads                    200")
                }
                5-> {
                    println("Bottle                70")
                    println("Water                 50")
                    println("Milk                  200")
                }
                6-> {
                    println("Exit")
                }

                else -> {
                    println("Invalid number")
                }
            }
        }
        else -> {
            println("Exit")
        }
    }

}