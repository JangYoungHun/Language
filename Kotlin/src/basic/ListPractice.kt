package basic

fun main(){

    //수정 가능
    val list1 = ArrayList<Int>()
    list1.add(1)
    list1.add(2)
    list1.add(3)
    println(list1)

    val list2 = listOf("one","two","three")
    //수정 불가
    // list2[0] = "0"
    list2.forEach { println(it) }

    //수정 가능
    val list3 = mutableListOf('a','b','c')
    list3[0] = 'd'

    for (ch in list3){
        println(ch)
    }

    val list4 = mutableListOf("apple", "box", "zero","stop","boring")
    // 길이가 4인 요소만 추출
    val list5 = list4.filter { it.length == 4 }
    // 반환 list 수정 불가
   // list5[0] = "asdf"
    //println(list5)
    list4.filter { it.length == 4 }.forEach { print("$it ") }
    println()

    val list6 = listOf(1,23,-41,5,6,13,-20,-1)
    // 모든 요소*2
    list6.map { it*2 }.forEach { print("$it ") }
    println()

    //요소중 특정값 이상 값 추출하여 2곱함
    list6.filter { it>10 }.map { it*2 }.forEach { print("$it ") }

    val list7 = listOf(1,3,5,7,9,11)
    // 전부 짝수인지 판별
    println("모든 요소가 짝수인가? ${list7.all { it%2 ==0 }}")
    println("모든 요소가 홀수인가? ${list7.all { it%2 !=0 }}")
    println("모든 요소가 짝수가 아닌가? ${list7.none { it%2 ==0 }}")
    println("모든 요소가 홀수가 아닌가? ${list7.none { it%2 !=0 }}")

    // 조건에 해당하는 요소가 한개이상 존재하는지 판별
    println("조건에 해당하는 요소가 한개이상 존재하는가? ${list7.any { it>10 }}" )
    println("조건에 해당하는 요소가 한개이상 존재하는가? ${list7.any { it<1 }}" )

    //요소 검색
    //list4 = mutableListOf("apple", "box", "zero","stop","boring")

    // 길이가 4인 제일 앞의 요소
    println(list4.find { it.length==4 })
    // 길이가 4인 제일 뒤의 요소 인덱스스
    println(list4.findLast { it.length==4 })

    val findResult:String = list4.find { it.startsWith('a') }?:"그런 요소는 없어!"
    println("a로 시작하는 요소가 있나? (앞에서부터 검색) $findResult" )


    // list6 = listOf(1,23,-41,5,6,13,-20,-1)
    //앞에서부터 검색 짝수인요소
    println("앞에서부터 검색, 처음 짝수인 요소 ${list6.first { it%2==0 }}")

    println("0보다 큰 요소 갯수 ${list6.count{ it>0}}")

}