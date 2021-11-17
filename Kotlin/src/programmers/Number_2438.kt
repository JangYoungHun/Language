package programmers

import java.util.*

fun main()= with(Scanner(System.`in`)){
    val n = nextInt()

    for(i in 1..n){
        println("*".repeat(i))
    }
}