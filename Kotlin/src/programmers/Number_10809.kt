package programmers

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val str = nextLine()

    val array = Array<Char>(26){' '}

    var index = 0
    for(ch in 'a'..'z'){
        array[index++] = ch
    }

    for(ch in array){
        println(str.indexOfFirst { it == ch })
    }


}
