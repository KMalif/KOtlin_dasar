import java.util.*

fun main(){
    //Operasi perbandingan
val input = Scanner(System.`in`)

    println("Masukan nila a")
    val a = input.nextInt()

    println("Masukan nila b")
    val b = input.nextInt()

  if (a<b){
      println("$a kurang dari $b")
  }
    if(a>b){
        println("$a lebih dari $b")
  }
    if(a==b){
        println("$a sama dengan $b")
    }

    println(" ")

}