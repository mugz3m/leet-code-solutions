package easy

fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(" ")
    if (pattern.length != words.size) return false

    val map = HashMap<Char, String>()
    for (i in pattern.indices) {
        val char = pattern[i]
        val containsKey = map.containsKey(char)
        if (map.containsValue(words[i]) && !containsKey)
            return false

        if (containsKey && map[char] != words[i]) {
            return false
        } else {
            map[char] = words[i]
        }
    }

    return true
}
