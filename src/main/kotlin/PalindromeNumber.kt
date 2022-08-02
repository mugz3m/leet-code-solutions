fun isPalindrome(x: Int): Boolean {
    val xString = x.toString()
    for (i in xString.indices) {
        if (xString[i] != xString[xString.length - i - 1])
            return false
    }
    return true
}
