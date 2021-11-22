package programmers

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    nextLine()
    println(nextLine().map { it-'0'}.sum())
}