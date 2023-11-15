fun main(){

    val basicPhone = BasicPhone()
    basicPhone.name = "Basic phone"
    basicPhone.company = "Nokia"
    basicPhone.weight = 21.0

    println(basicPhone.name)
    println(basicPhone.company)
    println(basicPhone.weight)
    basicPhone.display()

    val onePlus = OnePlus()
    onePlus.display()

}
open class Phone{

    var name : String = "Phone"
    var company : String = "Company"
    var weight : Double = 1.5

    fun makeCall(){
        println("Make call")
    }
    open fun display(){
        println("Display")
    }
    fun powerOff(){
        println("PowerOff")
    }
    fun deviceInfo(){
        println("Device Info")
    }
}

class BasicPhone : Phone() {
    fun colorColorInfo(){
    }
}

open class SmartPhone : Phone() {


    fun playMovie(){
    }
    fun takePicture(){

    }
    fun getLocation(){

    }
}

class OnePlus : SmartPhone(){
    override fun display() {
        //super.display()
        println("Display of OnePlus is different from smart phones")
    }
}