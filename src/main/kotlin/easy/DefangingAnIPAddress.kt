package easy

fun defangIPaddr(address: String): String = buildString {
    for (char in address) {
        if (char == '.') append("[.]")
        else append(char)
    }
}
