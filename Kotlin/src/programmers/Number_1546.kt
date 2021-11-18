package programmers


import java.util.*

fun main()= with(Scanner(System.`in`)){
    val n = nextInt()
    nextLine()

    val arr = nextLine().split(" ").map {(it).toDouble()}

    val max:Double = arr.maxOrNull()?:0.0

    println(arr.map { (it/max)*100 }.average())

}