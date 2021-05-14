private class Solution {
    fun reverse(x: Int): Int {
        var y = x.toString()
        y = y.reversed()

        return y.toInt()
    }
}

fun main() {
    val solution = Solution()
    println(solution.reverse(-123))


}