package easy

fun isPowerOfTwo(n: Int): Boolean {
    return n > 0 && (n and n - 1) == 0
}
