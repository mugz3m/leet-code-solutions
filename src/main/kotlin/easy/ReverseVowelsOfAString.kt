package easy

fun reverseVowels(s: String): String {
    var left = 0
    var right = s.lastIndex
    val vowels = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val chars: CharArray = s.toCharArray()

    while (left < right) {
        while (left < right && !vowels.contains(s[left])) {
            left++
        }

        while (left < right && !vowels.contains(s[right])) {
            right--
        }

        chars[left] = s[right]
        chars[right] = s[left]
        left++
        right--
    }

    return String(chars)
}
