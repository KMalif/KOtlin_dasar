import java.util.*

fun main(){
    println("============= Operasi Matematika=========")
    val result1: Int=100/25
    println(result1)

    val result2: Int=100/25+10
    println(result2)

    var total: Int=0
    val barang1 = 100
    total+=barang1
    val barang2 = 200
    total+=barang2

    total++ //total barang + 1
    println (total)

    println(" ")
    println("####ganjil genap#####")
    val input=Scanner(System.`in`)
    println("Masukan angka")
    val angka = input.nextInt()

    if(angka%2==0){
    println("$angka merupakan bilangan genap")
    }
    else{
        println("$angka merupakan bilangan ganjil")
    }
}
