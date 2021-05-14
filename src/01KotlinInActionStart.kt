fun main() {
    val people = listOf(Person("Masha"), Person("Pasha", 37))
    println("The oldest is: ${people.maxByOrNull { it.age ?: 0 }}")
    println("The youngest is: ${people.minByOrNull { it.age ?: 0 }}")
    println(people[0])
    next()



}

private data class Person(val name: String = "", val age: Int? = null)

