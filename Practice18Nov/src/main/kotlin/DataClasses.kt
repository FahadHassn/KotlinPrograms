fun main(){

    val a: Int

    val user = User("Fahad",1,"fahad@gmail.com")
    println(user)

    //data class with come automatically additional member functions

//    user.toString()
//    user.equals()
//    user.hashCode()
//    user.copy()
//    user.component1()

    //toString()
    val userString = User("User String", 1,"string@gmail.com")
    println(userString)

    //equal()

    println(user==userString)
    println(user.equals(userString))

    //hashCode()

    println(user.hashCode())

    //copy()

    val copyUser = user.copy()
    println(copyUser)

//    val copyUser = user.copy(name = "Hassan")
//    println(copyUser)

    //componentN()

    user.component1()
    user.component2()
    user.component3()


}

data class User(var name: String, var id: Int, var email: String)
