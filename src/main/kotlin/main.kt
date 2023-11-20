class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        return (if (n > b) n - b else 0) / (a - b) * b
    }
}

fun main() {

    var answer = Solution()

    println(answer.solution(3,1,20) )

}