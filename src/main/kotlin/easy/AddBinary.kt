package easy

fun addBinary(a: String, b: String): String {
    var i = a.lastIndex
    var j = b.lastIndex
    var carry = 0
    val res = StringBuilder()
    while (i >= 0 || j >= 0) {
        var sum = carry
        if (i >= 0) {
            sum += a[i] - '0'
            i--
        }
        if (j >= 0) {
            sum += b[j] - '0'
            j--
        }
        carry = if (sum > 1) 1 else 0
        res.append(sum % 2)
    }
    if (carry != 0) res.append(carry)
    return res.reverse().toString()
}
