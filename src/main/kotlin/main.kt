import java.math.

class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        var point = intArrayOf(0, 0, 0)

        for (i in 0 .. answers.lastIndex) {
            val one = intArrayOf(1, 2, 3, 4, 5)
            val two = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
            val three = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

            if(answers[i] == one[i % answers.size]) {point.set(0, point[0] + 1)}
            if(answers[i] == two[i % answers.size]) {point.set(1, point[1] + 1)}
            if(answers[i] == three[i % answers.size]) {point.set(2, point[2] + 1)}
        }

        for (i in 0 .. point.lastIndex) {
            if (point[i] == point.maxOrNull()) {
                answer += i + 1
            }
        }

        answer.sorted()


        return answer
    }
}

fun main() {
    var n = Solution()

    println(n.solution(intArrayOf(1,2,3,4,5)).joinToString())
    println(n.solution(intArrayOf(1,3,2,4,2)).joinToString())
}