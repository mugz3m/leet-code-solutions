package medium

private var lo = 0
private var maxLen = 0

fun longestPalindrome(s: String): String {
    val len = s.length
    if (len < 2) return s

    for (i in 0 until len - 1) {
        extendPalindrome(s, i, i)
        extendPalindrome(s, i, i + 1)
    }

    return s.substring(lo, lo + maxLen)
}

private fun extendPalindrome(s: String, j: Int, k: Int) {
    var localJ = j
    var localK = k
    while (localJ >= 0 && localK < s.length && s[localJ] == s[localK]) {
        localJ--
        localK++
    }
    if (maxLen < localK - localJ - 1) {
        lo = localJ + 1
        maxLen = localK - localJ - 1
    }
}
