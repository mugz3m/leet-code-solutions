package easy

fun addDigits(num: Int): Int {
    return when {
        num == 0 -> 0
        num % 9 == 0 -> 9
        else -> num % 9
    }
}
