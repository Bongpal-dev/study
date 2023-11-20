fun calcal (n: List<Double>): MutableList<Double> {
    var numbers = n
    val results = mutableListOf<Double>()
    calculateOperations(numbers.toMutableList(), mutableListOf(), results)
    var ans = mutableListOf<Double>()

    for (result in results) {
        ans += result
    }
    return ans
}

fun calculateOperations(
    remainingNumbers: MutableList<Double>,
    operations: MutableList<Double>,
    results: MutableList<Double>
) {
    if (remainingNumbers.isEmpty()) {
        results.add(operations[0] + operations[1] - operations[2] * operations[3] / operations[4])
        return
    }

    for (i in remainingNumbers.indices) {
        val newRemaining = remainingNumbers.toMutableList()
        val newOperations = operations.toMutableList()

        newOperations.add(remainingNumbers[i])
        newRemaining.removeAt(i)

        calculateOperations(newRemaining, newOperations, results)
    }
}
