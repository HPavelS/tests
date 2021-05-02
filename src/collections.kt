fun main() {
    val list = listOf<String?>("1","2",null)
    list.forEach { print("$it ") }
    next()

    list.forEachIndexed { index, data -> println("| $index -> $data ") }

    if (list.contains("2"))
        println("index = ${list.indexOf("2")}")
    println("element index 0 = ${list[0]}")
    println("-------------------------------")

    val mutList = mutableListOf("first", "second", "end")
    mutList.add("plus")
    mutList.forEach { print("$it ")}
    next()

    println("Находим элемен списка и меняем его")
    if (mutList.contains("end"))
        mutList[mutList.indexOf("end")] = "three"
    mutList.forEach { print("$it ")}
    next()

    mutList.add(2, "newElement")
    mutList.forEach { print("$it ")}
    next()

    if (mutList.contains("newElement"))
        mutList.remove("newElement")
    mutList.forEach { print("$it ")}
    next()

    if (mutList.size > 0)
        mutList.removeAt(0)
    mutList.forEach { print("$it ")}
    next()

    if (mutList.size > 0)
        mutList[0] = "coffee"

    mutList.forEach { print("$it ")}
    next()

    val intMutList = mutableListOf(2,1,0,3,4,5,6,7,8)
    intMutList.sort()
//    intMutList.reverse()
    intMutList.forEach {print("$it ")}
    next()

    var toAdd = listOf( 9, 10, 11)
    intMutList.addAll(toAdd)
    intMutList.forEach {print("$it ")}
    next()

    println ("сравниваем два списка и оставляем только те элементы которые совпадают")
    val toRetain = listOf(2,1,0,3,4,5,6, 222)
    intMutList.retainAll(toRetain)
    intMutList.forEach {print("$it ")}
    next()

    println ("Перемешиваем все элементы")
    intMutList.shuffle()
    intMutList.forEach {print("$it ")}
    next()
    intMutList.sort()

    println("уничтожаем все содержимое что бы размер был равен 0")
    intMutList.clear()
    intMutList.forEach {print("$it ")}
    print("размер = ${intMutList.size}")
    next()

    toAdd = listOf(0,1,2,3,4,5,6,7,8)
    intMutList.addAll(toAdd)
    intMutList.forEach {print("$it ")}
    next()

    println("Копируем список но это будет List а не MutableList")
    val copyList = intMutList.toList()
    copyList.forEach { print("$it ") }
    next()

    println("Копируем список но это будет MutableList")
    val copyList2 = intMutList.toMutableList()
    copyList2.forEach { print("$it ") }
    next()

}

fun next() {
    println("")
    println("-------------------------------")
}
