package programmers

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    var (hour, min)= nextLine().split(" ").map {Integer.parseInt(it)}
/*    val hour = input[0]
    var min = input[1]*/
    //분으로 계산

    min = hour * 60+ min - 45

    if (min < 0)
        min += 24 * 60

    val resultH = min / 60
    val resultMin = when {
        (min % 60) != 0 -> min % 60
        else -> "0"
    }

    // 다시 시:분 으로 변경
    println("${min / 60} $resultMin")

}