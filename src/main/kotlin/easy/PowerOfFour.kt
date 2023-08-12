package easy

fun isPowerOfFour(n: Int): Boolean = isPowerOfTwo(n) && (n - 1) % 3 == 0
