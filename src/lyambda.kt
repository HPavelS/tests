fun main() {
    println("-------Простые лямбда--------")
    val l1 = {b:Int -> b + 5}
    val l2 = {b:Int, c:String -> c + b}
    val l3: (Int) -> Int = {it + 9}

    val lText = {"Text"}
    var result = l1.invoke(4)
    println(result)
    println(l2(1, "10"))// можно без invoke
    println(lText.invoke())
    println(l3(8))
    next()
}