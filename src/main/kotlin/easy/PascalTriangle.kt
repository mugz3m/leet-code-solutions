package easy

fun generate(numRows: Int): List<List<Int>> {
    if (numRows == 1) return arrayListOf(arrayListOf(1))
    if (numRows == 2) return arrayListOf(arrayListOf(1), arrayListOf(1, 1))

    val result = arrayListOf(arrayListOf(1), arrayListOf(1, 1))
    for (i in 2 until numRows) {
        val newRow = ArrayList<Int>(i + 1)
        newRow.add(1)
        for (j in 1 until i) {
            newRow.add(result[i - 1][j - 1] + result[i - 1][j])
        }
        newRow.add(1)
        result.add(newRow)
    }

    return result
}
