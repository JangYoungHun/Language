package programmers


import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    nextLine()
    for(j in 1..n) {
        val str = nextLine()
        var result = 0
        var score = 0
        for (element in str) {

            result += when (element) {
                'O' -> ++score
                else -> {
                    score = 0
                    score
                }
            }
        }
        println(result)
    }

}