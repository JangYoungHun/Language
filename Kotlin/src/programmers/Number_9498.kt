package programmers

import java.util.*

fun main(args:Array<String>)= with(Scanner(System.`in`)){

    val score = nextInt()
    println(when{
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    })

}