fun main(){

    val variable = MyClass.create()

    println(variable.formattedString())
}

class MyClass(){
    companion object{
        fun create() : String{
            return "Create method of companion object"
        }
    }
}