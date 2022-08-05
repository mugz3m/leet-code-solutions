package easy

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    return longestCommonPrefix(strs, 0, strs.size - 1)
}

fun longestCommonPrefix(strs: Array<String>, startIndex: Int, endIndex: Int): String {
    if (endIndex - startIndex + 1 == 2) return commonPrefix(strs[startIndex], strs[endIndex])
    if (startIndex == endIndex) return strs[startIndex]

    val middleIndex = (startIndex + endIndex) / 2

    val prefix1 = longestCommonPrefix(strs, startIndex, middleIndex)
    val prefix2 = longestCommonPrefix(strs, middleIndex + 1, endIndex)

    return commonPrefix(prefix1, prefix2)
}

fun commonPrefix(str1: String, str2: String): String {
    var count = 0
    for (i in 0 until minOf(str1.length, str2.length)) {
        if (str1[i] != str2[i]) {
            return str1.substring(0, count)
        }
        count++
    }

    return str1.substring(0, count)
}
