package programmers

import java.util.*

fun main(args:Array<String>)= with(Scanner(System.`in`)){
    val t = nextInt()

    for(i in 1..t) {
        val num1 = nextInt()
        val num2 = nextInt()

        println("Case #$i: $num1 + $num2 = ${num1+num2}")
    }

}