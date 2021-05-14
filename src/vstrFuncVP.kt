private data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int)
fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )
    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    val sum = groceries.sumBy { it.quantity }
    val sumDouble = groceries.sumByDouble { x:Grocery -> x.unitPrice }
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println(highestUnitPrice)
    println(sum)
    println(sumDouble)
    println(totalPrice)
    val vegetables = groceries.filter { it.category == "Vegetable" }
    println(vegetables)
    val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
    println(unitPriceOver3)

    val inst = listOf(1,2,3,4)
    val mapInst = inst.map{it*2}
    println(mapInst)
    val groceryName = groceries.map { it.name }
    println(groceryName)
    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println(halfUnitPrice)
    val newPrice = groceries.filter { it.unitPrice > 3}.map { it.unitPrice * 2 }
    println(newPrice)
    val categogies = groceries.groupBy { it.category }
    println(categogies)
    categogies.forEach{ (key, item) ->
//        println(item)
        println("$key is ${item.map { it.name }}")
    }

    val listArr = arrayOf(1,2,3)
    val fold = listArr.fold(0){init, item -> init + item}
    println(fold)
    println(groceries.fold(""){string, it -> "$string ${it.name}" })
    println(groceries.fold(100.0){init, it -> init - it.unitPrice * it.quantity})
}