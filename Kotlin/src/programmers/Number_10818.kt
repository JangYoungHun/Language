package programmers

import java.util.*

fun main(args:Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = Array(n){nextInt()}

    print("${arr.minOrNull()} ${arr.maxOrNull()}")

}