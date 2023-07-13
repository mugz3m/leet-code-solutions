package easy

fun titleToNumber(columnTitle: String): Int {
    var result = 0
    for (char in columnTitle)
        result = result * 26 + char.position()

    return result
}

private fun Char.position(): Int = this.minus('A') + 1
