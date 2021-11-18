package basic

fun main(){

    val map1 = mapOf("one" to 1 ,"two" to 2,"three" to 3,"four" to 4)
    println(map1)
    // 수정 불가
    //map1["one"] = 5
    val map2 = map1.toMutableMap()
    map2["one"] = 4
    println(map2)


    val map3 = listOf("apple","orange","banana","grapes")
    val map4 = listOf("shirts","pants","jeans")

    val map5 = map3 + map4
    println(map5)

    val map6 = listOf(map3,map4)
    println(map6)

    val map7 = map6.flatten()
    println(map7)


}