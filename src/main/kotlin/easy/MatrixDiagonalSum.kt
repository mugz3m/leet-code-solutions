package easy

fun diagonalSum(mat: Array<IntArray>): Int {
    var sum = 0;
    for (i in mat.indices)
        sum += mat[i][i] + mat[i][mat.lastIndex - i]

    return if (mat.size % 2 == 0) sum else sum - mat[mat.size / 2][mat.size / 2]
}
