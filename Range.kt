

fun main(){

    val range1 = 100 downTo 0 step 2
    val range2 = 1..100 step 2
    val range = 12 downTo 1


println("======range========")
    println(range.count())
    println("pada range ada nilai 14 ?"+range.contains(14))
    println(range.contains(150))
    println(range.first)
    println(range.last)
    println(range.step)


    println("======range1========")
    println(range1.count())
    println(range1.contains(14))
    println(range1.contains(150))
    println(range1.first)
    println(range1.last)
    println(range1.step)


    println("======range2========")
    println(range2.count())
    println("apakah pada range2 ada nilai 14"+range2.contains(14))
    println("apakah pada range2 ada nila 150"+range2.contains(150))
    println(range2.first)
    println(range2.last)
    println(range2.step)

    println("======perulangan range=======")
    for(i in range){

        println ("data ke-$i = $i")
    }
    println("=======until============")
    for(i in 1 until 10){
    println("data ke-$i = $i")
    }
}