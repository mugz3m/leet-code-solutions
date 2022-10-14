package easy

fun reverseBits(n: Int): Int {
    if (n == 0) return 0

    var newN = n
    var result = 0
    for (i in 0 until 32) {
        result = result shl 1
        if (newN and 1 == 1) result++
        newN = newN shr 1
    }

    return result
}
