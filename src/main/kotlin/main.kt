class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for(i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size -1){
                for (k in j+1 until nums.size){
                    var combi = nums[i] + nums [j] + nums[k]

                    if(check(combi)){
                        answer += 1
                    }
                }
            }
        }

        return answer

    }
}

fun check (n: Int): Boolean{
    for (c in 2 until n) {
        if (n % c == 0) {
            return false
        }
    }
    return true
}
fun main() {
    var n = Solution()

    println(n.solution(intArrayOf(1, 2, 3, 4)))
    println(n.solution(intArrayOf(1, 2, 7, 6, 4)))
    println(n.solution(intArrayOf(1, 2, 3, 9, 10, 7, 6, 4)))

}

