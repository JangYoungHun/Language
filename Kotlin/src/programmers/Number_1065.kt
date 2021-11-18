package programmers


import java.util.*

fun main()= with(Scanner(System.`in`)){
    val n = nextInt()
    var cnt = 0

    for (i in 1..n){
        if(i <=99)
            cnt++
        else
            if(solution(i))
                cnt++
    }

    println(cnt)
}

fun solution(n:Int): Boolean{

    val str = n.toString()

    val d = (str[1]-'0') - (str[0]-'0')

    for(i in 2 until str.length){
        val d2 = (str[i]-'0') - (str[i-1]-'0')
        if(d2 != d)
            return false
    }
    return true

}