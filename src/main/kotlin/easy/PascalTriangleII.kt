package easy

fun getRow(rowIndex: Int): List<Int> {
    if (rowIndex == 0) return arrayListOf(1)
    if (rowIndex == 1) return arrayListOf(1, 1)

    val result = arrayListOf(arrayListOf(1), arrayListOf(1, 1))
    for (i in 2 .. rowIndex) {
        val newRow = ArrayList<Int>(i + 1)
        newRow.add(1)
        for (j in 1 until  i) {
            newRow.add(result[i - 1][j - 1] + result[i - 1][j])
        }
        newRow.add(1)
        result.add(newRow)
    }

    return result[rowIndex]
}
