package basic

fun main() {
    // 중복 허용 X
    val set1 = setOf(1, 2, 3, 4, 4)
    println(set1)
    //변경 불가
    // set1.add

    val set2 = mutableSetOf("start", "end", "setTT", "Happy")
    // 값 추가시  추가전 존재 여부 반환
    println("추가 하려는 값이 이미 존재하지 않는가? ${set2.add("start")}")
    println("추가 하려는 값이 이미 존재하지 않는가? ${set2.add("Start")}")

    // 요소 filter
    set2.filter{it.length ==5}.forEach { print("$it ") }

}


