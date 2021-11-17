package programmers

import java.util.*

fun main()= with(Scanner(System.`in`)){
    val t = nextInt()

    for(i in 1..t) {
        println("Case #$i: ${nextInt()+nextInt()}")
    }

}