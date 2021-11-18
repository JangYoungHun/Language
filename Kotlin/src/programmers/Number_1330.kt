package programmers

import java.util.*

fun main()=with(Scanner(System.`in`)){

    val input = nextLine().split(" ").map { Integer.parseInt(it)}

    println(when{
        input[0] < input[1] -> "<"
        input[0] > input[1] -> ">"
        else -> "=="
    } )


}