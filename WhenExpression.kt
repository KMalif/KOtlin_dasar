import java.util.*

fun main() {
    val input=Scanner(System.`in`)


    println("Masukan Nilai UAS")
    println("Answer with A,B,C or D")
    val UAS = input.nextLine()


    when(UAS){
        "A"-> println("Amazing")
        "B"-> println("Good")
        "C"-> println("Not Bad")
        "D"-> println("Bad")
        else-> println("Ups")
    }



}