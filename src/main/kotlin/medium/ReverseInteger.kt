package medium

fun reverse(x: Int): Int {
    var newX = x
    var result = 0
    while (newX != 0) {
        val newResult = result * 10 + newX % 10
        if (result != (newResult - newX % 10) / 10) return 0
        result = newResult
        newX /= 10
    }
    return result
}
