package programmers

import java.util.*

fun main()=with(Scanner(System.`in`)){

    val arr = Array(9){nextInt()}

    val result = arr.indices.maxByOrNull{arr[it]}?.run {
        (this to arr[this])
    }

    println(result?.second)
    println(result?.first!!+1)

}