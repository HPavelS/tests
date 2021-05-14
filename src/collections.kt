fun main() {
    val list = listOf("1","2",null)
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

    println("Сортировка")
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

    println("Создаем коллекцию Set и видим что она убирает все дубликаты в момент создания списка")
    val friendSet = setOf("Pavel", "Andrey", "Katya", "Katya", "Katya", "Pavel", "Andrey")
    friendSet.forEach { println("$it ") }
    next()

    println("добавляем все элементы списка toAdd к списку MutableSet")
    toAdd = listOf(0,1,2,0,4,4,6,2,8)
    var setInt = mutableSetOf<Int>()
    setInt.addAll(toAdd)
    setInt.forEach { print("$it ") }
    next()

    println("копируем toAdd в MutableSet")
    setInt = toAdd.toMutableSet()
    setInt.forEach { print("$it ") }
    next()

    println("проверяем есть ли одинаковые элементы в toAdd")
    if (toAdd.size != toAdd.toSet().size)
        println("есть дубликаты")
    else println("нет дубликатов")
    next()

    println("Создаем Map")
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    recipeMap.forEach { (key, item) -> print("$key -> $item ") }
    println("")
    print(recipeMap)

    next()

    println("Проверка ключа")
    print("такой ключ = ${recipeMap.containsKey("Recipe1")}")
    next()

    println("Проверка значения")
    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck))
        println("Такое значение существует")
    next()

    println("Получаем значение из ключа")
    if (recipeMap.containsKey("Recipe1")) {
        val value = recipeMap.getValue("Recipe1")
        println(value)
    }
    next()

    println("создаем и добавляем еще один элемент к mutableMafOf")
    val mutMap = mutableMapOf("key1" to "1", "key2" to "2")
    mutMap.put("key3", "3")
    mutMap["key4"] = "4"
    println(mutMap)
    next()

    println("добавляем несколько элементов к mutableMapOf")
    val mutAdd = mapOf("key5" to "5", "key6" to "6")
    mutMap.putAll(mutAdd)
    println(mutMap)
    next()

    println("удаляем элеаменты mutableMapOf")
    mutMap.remove("key6")
    println(mutMap.remove("key5", "5"))  //удалит только если есть ключ и в нем указанные данные
    println(mutMap)
    next()

    println("копируем mutableMapOf в List и в Set")
    val mapToList = mutMap.toList()
    println(mapToList)
    val mapToSet = mutMap.entries
    println(mapToList)
    next()

    println("копируем только value значения и толко keys в разные списки")
    val mapToListKeys = mutMap.keys.toList()
    println(mapToListKeys)
    val mapToListValues = mutMap.values.toList()
    println(mapToListValues)
    next()

    println("проверяем нет ли одинаковых значений в Map")
    mutMap["key5"] = "4"
    if (mutMap.size > mutMap.values.toSet().size)
        println(true)
    else
        println(false)
    next()

}

fun next() {
    println("")
    println("-------------------------------")
}

private data class Recipe(val name:String = "")
