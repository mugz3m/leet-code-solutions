package medium

fun myAtoi(s: String): Int {
    if (s.isEmpty())
        return 0

    var index = 0
    while (index < s.lastIndex && s[index] == ' ') {
        index++
    }

    var sign = 1
    if (s[index] == '-' || s[index] == '+') {
        if (s[index] == '-') sign = -1
        index++
    }

    var result = 0
    while (index < s.length) {
        val digit = s[index] - '0'
        if (digit < 0 || digit > 9)
            break

        if (Int.MAX_VALUE / 10 < result || Int.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit)
            return if (sign == -1) Int.MIN_VALUE else Int.MAX_VALUE

        result = result * 10 + digit
        index++
    }

    return result * sign
}
