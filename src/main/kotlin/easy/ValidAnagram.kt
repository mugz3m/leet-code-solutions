package easy

fun isAnagram(s: String, t: String): Boolean {
    return s.toCharArray().apply { sort() } contentEquals t.toCharArray().apply { sort() }
}
