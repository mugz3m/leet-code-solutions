package medium

fun rotate(matrix: Array<IntArray>) {
    for (i in 0 until matrix.size / 2) {
        for (j in i until matrix.size - i - 1) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[matrix.size - 1 - j][i]
            matrix[matrix.size - 1 - j][i] = matrix[matrix.size - 1 - i][matrix.size - 1 - j]
            matrix[matrix.size - 1 - i][matrix.size - 1 - j] = matrix[j][matrix.size - 1 - i]
            matrix[j][matrix.size - 1 - i] = temp
        }
    }
}
