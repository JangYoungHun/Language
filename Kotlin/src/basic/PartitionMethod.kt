package basic

fun main(){

    val list1 = listOf(1,2,3,4,5,6)
    val map1 = mapOf("one" to 1 ,"two" to 2,"three" to 3,"four" to 4)


    val (list2,list3) = list1.partition { it%2 == 0 }
    println("list2 : $list2")
    println("list3 : $list3")

    //map은 사용불가
  //  val (map2,map3) = map1.partition
    //println("map2 : $map2")
    //println("map3 : $map3")

}