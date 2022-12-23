package medium

import kotlin.math.max

fun lengthOfLongestSubstring(s: String): Int {
    var fastPointer = 0
    var slowPointer = 0
    var maxSubstringLength = 0
    val substringCharsSet = HashSet<Char>()

    while (fastPointer < s.length) {
        if (!substringCharsSet.contains(s[fastPointer])) {
            substringCharsSet.add(s[fastPointer++])
            maxSubstringLength = max(maxSubstringLength, substringCharsSet.size)
        } else {
            substringCharsSet.remove(s[slowPointer++])
        }
    }

    return maxSubstringLength
}
