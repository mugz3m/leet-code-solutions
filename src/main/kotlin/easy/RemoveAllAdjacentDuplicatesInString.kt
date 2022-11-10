package easy

fun removeDuplicates(s: String): String {
    val stringBuilder = StringBuilder()
    s.forEach {
        val stringBuilderSize = stringBuilder.length
        if (stringBuilderSize > 0 && stringBuilder[stringBuilderSize - 1] == it)
            stringBuilder.deleteAt(stringBuilderSize - 1)
        else
            stringBuilder.append(it)
    }
    return stringBuilder.toString()
}
