package programmers

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()

    for (i in 1..n) {

        for (j in 1..n-i)
            print(" ")

        for (k in 1..i)
            print("*")

        println()
    }
}