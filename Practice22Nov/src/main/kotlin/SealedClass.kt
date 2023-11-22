enum class EnumClass(){
    Success,
    Error;
}

sealed class SealedClass(){

    data class Success(val code : Int) : SealedClass()
    class Error() : SealedClass()

}

fun main(){

    val sealed = SealedClass.Success(401)

    println(sealed.code)

    val enum = EnumClass.entries
    print(enum)

}
