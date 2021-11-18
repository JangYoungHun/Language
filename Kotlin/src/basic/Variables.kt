package basic

fun main(){

    var a:Int = 10
    // 형식 추론
    var b = 10
    // 합 출력
    println(a+b)

    // 값 변경 가능
    a = 30
    b = 2;
    // 합 출력
    println(a+b)

    val c = 30
    //c = 20  Error 값 변경 불가
    var str1 = "Hello"
    val result = true

    println(str1 + " a+b = ${a+b}")
}