package easy

fun longestPalindrome(s: String?): Int {
    if (s.isNullOrEmpty()) return 0

    val charHashSet = HashSet<Char>()
    var count = 0
    for (i in s.indices) {
        if (charHashSet.contains(s[i])) {
            charHashSet.remove(s[i])
            count++
        } else {
            charHashSet.add(s[i])
        }
    }
    return if (charHashSet.isNotEmpty()) count * 2 + 1 else count * 2
}
