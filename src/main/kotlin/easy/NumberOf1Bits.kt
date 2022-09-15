package easy

fun hammingWeight(n: Int): Int {
    var newN = n
    var setBitCount = 0
    while (newN != 0) {
        newN = newN and newN - 1
        ++setBitCount
    }
    return setBitCount
}
