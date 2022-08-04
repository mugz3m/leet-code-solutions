package easy

fun isValid(s: String): Boolean {
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
