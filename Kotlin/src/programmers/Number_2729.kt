package programmers

import java.util.*

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    for(i in 1..9){
        println("$n * $i = ${n*i}")
    }
}