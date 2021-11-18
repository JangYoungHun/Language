package programmers


import java.util.*

fun main()= with(Scanner(System.`in`)){
    val A = nextInt()
    val B = nextInt()
    val C = nextInt()

    val num = (A*B*C).toString()

    val arr = Array(10){0}

    num.forEach {
        arr[it-'0'] += 1
    }

    arr.forEach { println(it) }
}