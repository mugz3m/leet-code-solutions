package easy

fun reverseString(s: CharArray): Unit {
    for (i in 0 until s.size / 2) {
        val tmp = s[i]
        s[i] = s[s.lastIndex - i]
        s[s.lastIndex - i] = tmp
    }
}
