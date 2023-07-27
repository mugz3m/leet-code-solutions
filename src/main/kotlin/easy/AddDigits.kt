package easy

fun addDigits(num: Int): Int {
    var result = num
    while (result / 10 != 0) {
        result = result / 10 + result % 10
    }

    return result
}
