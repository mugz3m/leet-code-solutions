package medium

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val builder = StringBuilder()
    val n = s.length
    val diff = 2 * (numRows - 1)
    var diagonalDiff: Int
    var secondIndex: Int
    var index: Int
    for (i in 0 until numRows) {
        index = i
        while (index < n) {
            builder.append(s[index])
            if (i != 0 && i != numRows - 1) {
                diagonalDiff = diff - 2 * i
                secondIndex = index + diagonalDiff
                if (secondIndex < n) {
                    builder.append(s[secondIndex])
                }
            }
            index += diff
        }
    }

    return builder.toString()
}
