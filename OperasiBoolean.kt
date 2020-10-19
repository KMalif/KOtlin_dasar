import java.util.*

fun main(){
    val input=Scanner(System.`in`)
    println("Masukan Nilai UAS")
    val UAS = input.nextInt()
    println("Masukan Nilai Kehadiran")
    val HADIR = input.nextInt()

    val PassUAS= UAS>=75
    val PassHADIR= HADIR>=80

    val lulus = (PassUAS && PassHADIR)//operasi boolean &&

    if(lulus==true){
        println("LULUS")
    }
    else{
        println("TIDAK LULUS")
    }


}