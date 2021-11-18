package basic


data class Item(val name:String, val price:Float)
data class Order(val items:Collection<Item>, val num:Int)

fun Order.maxPriceItemPrice():Float = this.items.maxByOrNull { it.price }?.price?:0f
fun Order.maxPriceItemName():String = this.items.maxByOrNull { it.price }?.name?:"No Item"
val Order.commaDelimitedItemNames : String
    get() = items.joinToString { it.name }

fun main(){

    val itemList = listOf<Item>(Item("box",100f), Item("toy",2000f), Item("pen",500f))

    val order = Order(itemList,5)

    println("가장 비싼 Item 가격 ${order.maxPriceItemPrice()}")
    println("가장 비싼 Item 이름 ${order.maxPriceItemName()}")
    println(order.commaDelimitedItemNames)
}

