import java.util.Scanner

fun main(){

    println("Hello world".formattedString())

    val scanner = Scanner(System.`in`)
    print("Enter your marks: ")
    val studentMarks = scanner.nextInt()

    val student = Student()
    val passingStatus = student.isPassed(studentMarks)
    println("The passing status is: $passingStatus")

    val excellentStatus = student.isExcellent(studentMarks)
    println("The excellent status is: $excellentStatus")
}

fun String.formattedString() : String{
    return "--------------------\n$this\n--------------------"
}

class Student(){
    fun isPassed(mark: Int) : Boolean{
        return mark>40
    }
}

fun Student.isExcellent(mark: Int) : Boolean{
    return mark>90
}