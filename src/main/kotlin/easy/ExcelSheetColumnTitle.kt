package easy

fun convertToTitle(columnNumber: Int): String {
    val base = 26
    var localColumnNumber = columnNumber
    return buildString {
        while (localColumnNumber > 0) {
            val position = (localColumnNumber - 1) % base
            insert(0, position.asChar())
            localColumnNumber = (localColumnNumber - position) / base
        }
    }
}

private fun Int.asChar(): Char = 'A'.plus(this)
