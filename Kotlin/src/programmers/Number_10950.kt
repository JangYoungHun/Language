package programmers

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val t = Integer.parseInt(readLine())

    for(i in 1..t){
        println(readLine().filter { it!=' '}.map {it-'0'}.sum())
    }
}