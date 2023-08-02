package easy

fun countBits(n: Int): IntArray {
    val result = IntArray(n + 1)
    for (i in 0 .. n) {
        result[i] = result[i shr 1] + (i and 1)
    }

    return result
}
