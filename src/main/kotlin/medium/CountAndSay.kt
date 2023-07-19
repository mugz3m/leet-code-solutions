package medium

fun countAndSay(n: Int): String {
    if (n == 1) return "1"

    return helper(countAndSay(n - 1))
}

private fun helper(str: String): String {
    var count = 1
    val stringBuilder = StringBuilder()
    for (i in 0 until str.lastIndex) {
        if (str[i] != str[i + 1]) {
            stringBuilder.append(count).append(str[i])
            count = 1
        } else {
            count++
        }
    }
    stringBuilder.append(count).append(str.last())

    return stringBuilder.toString()
}
