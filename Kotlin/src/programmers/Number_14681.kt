package programmers

import java.util.*

fun main(args:Array<String>)= with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()

    val result = when{
        a > 0 && b > 0 -> 1
        a < 0 && b > 0 -> 2
        a < 0 && b < 0 -> 3
        a > 0 && b < 0 -> 4
        else -> -1
    }

    println(result)
}