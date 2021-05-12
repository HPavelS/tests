data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double,
                   val quantity: Int)
fun main(args: Array<String>) {
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
}