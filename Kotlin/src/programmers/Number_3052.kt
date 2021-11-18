package programmers


import java.util.*

fun main()= with(Scanner(System.`in`)){

    val s = mutableSetOf<Int>()

    for (i in 1..10){
        s.add(nextInt()%42)
    }

    println(s.size)

}