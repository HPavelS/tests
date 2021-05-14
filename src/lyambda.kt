fun main() {
    println("-------Простые лямбда--------")
    val l1 = {b:Int -> b + 5}
    val l2 = {b:Int, c:String -> c + b}
    val l3: (Int) -> Int = {it + 9}
    val l4 = { println("Hello")}

    val lText = {"Text"}
    var result = l1.invoke(4)
    println(result)
    println(l2(1, "10"))// можно без invoke
    println(lText.invoke())
    println(l3(8))
    l4()
    next()

    println("-------лямбда в функцию----------")
    val x = 20.2
    val y = 4.8

    println("Периметр прямоугольника = " + lFun(x, y) {a, b ->
        println("$a $b")
        (a+b)*2})
    println("площадь прямоугольника = " + lFun(x, y) {a, b -> a*b})
    println("Периметр квадрата = " + lFun2{it*4} )
    next()
    println("-----------возврат лямбды из фукнции-----------")

    val l5 = lReturn("toTons")
    val mass = 10.2
    println(l5(mass))
    println(lReturn("toCentners")(20.0))
    next()
    println("-----------Определить два лямбда-выражения для преобразований-----------")
    //Определить два лямбда-выражения для преобразований
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }
//Объединить два выражения
    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)
//Выполнить лямбда-выражение kgsToUSTons
    val usTons = kgsToUSTons(1000.0)    //1.1023115
    println(usTons)
    next()
    println(myFun1 (5){it*3})
    next()
    println(poundsToUSTons(2.0))
    next()
}
private fun lFun(x: Double, y:Double, formula: (Double, Double) -> Double): Double {
    return (formula(x,y))
}
private fun lFun2(formula: (Double) -> Double): Double {
    return (formula(5.0))
}

private fun lReturn(param: String): (Double) -> Double{
    when(param){
        "toTons" -> return {it/1000}
        "toCentners" -> return {x -> x/100}
        else -> return {it}
    }
}

private fun combine(lambda1: (Double) -> Double,
            lambda2: (Double) -> Double): (Double) -> Double {
    return { x: Double -> lambda2(lambda1(x)) }
}

private fun myFun1(x: Int = 6, y: (Int) -> Int = { it }): Int {
    return y(x)
}
