class Example {
    fun print(t: String? = "Kotlin" ) {
        var he = t ?: "Kotlin"
        println("Hello, ${he}!")
    }
}

fun main() {
    val example = Example()
    val msg = example::print // 람다 표현식 사용
    msg(null) // 메서드 호출
    msg("world")
    msg("me")
}
