package programmers

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (n,x) = nextLine().split(" ").map { Integer.parseInt(it)}

    val arr = Array(n){nextInt()}

    arr.filter { it < x }.forEach { print("$it ") }
}
