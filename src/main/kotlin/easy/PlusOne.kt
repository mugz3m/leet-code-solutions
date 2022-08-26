package easy

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    val newNumber = IntArray(digits.size + 1)
    newNumber[0] = 1

    return newNumber
}
