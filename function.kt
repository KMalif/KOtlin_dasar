fun function(){     //function
    println("contoh function")
    println("dipanggil dengan")
    println("memanggil nama function di main class")
}
fun checkGanjilGenap(nilai: Int){     //function parameter
    if(nilai%2 == 0){
        println("$nilai Ini bilangan genap")
    }else{
        println("$nilai Ini bilangan ganjil")
    }
}

fun defaultargumen(firstname:String, lastname: String? = null){
    if(lastname == null){
        println("HI $firstname")
    }else {
        println("HI $firstname $lastname")
    }
}
fun main(){
    function()
    println("==================================")

    checkGanjilGenap(4)

    println("==================================")
    defaultargumen("Eko")
    defaultargumen("khafidul","mualif")
}