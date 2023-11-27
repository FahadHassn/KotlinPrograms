fun main() {

    val myCallback = object : MyCallback{
        override fun onSuccess(result: String) {
            println(result)
        }

        override fun onFailure(error: String) {
            println(error)
        }
    }

    performAsyncOperation(myCallback)

}

interface MyCallback{
    fun onSuccess(result: String)
    fun onFailure(error: String)
}

fun performAsyncOperation(callback: MyCallback){
    val isSuccess = true
    if (isSuccess){
        callback.onSuccess("Operation successful")
    }else{
        callback.onFailure("Operation failed")
    }

}