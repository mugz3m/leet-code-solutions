package easy

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    var sIndex = 0
    for (i in t.indices) {
        if (t[i] == s[sIndex]) sIndex++
        if (sIndex == s.length) return true
    }
    return false
}
