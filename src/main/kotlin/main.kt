fun main() {

    println(num(1, 2, 3, *intArrayOf(2, 3, 4, 5)))

}

fun num(vararg n: Int): Int {
    return n.sum() + 1
}