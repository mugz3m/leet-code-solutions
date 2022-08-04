package easy

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    val stack = ArrayDeque<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> stack.addLast(it)
            ')' -> if (stack.removeLastOrNull() != '(') return false
            ']' -> if (stack.removeLastOrNull() != '[') return false
            '}' -> if (stack.removeLastOrNull() != '{') return false
        }
    }

    return stack.isEmpty()
}
