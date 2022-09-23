package easy

fun isPalindrome(s: String): Boolean {
    var leftPointer = 0
    var rightPointer = s.lastIndex

    while (leftPointer < rightPointer) {
        while(!s[leftPointer].isLetterOrDigit() && leftPointer < rightPointer)
            leftPointer++
        while (!s[rightPointer].isLetterOrDigit() && leftPointer < rightPointer)
            rightPointer--
        if (s[leftPointer].lowercase() != s[rightPointer].lowercase() ) return false
        else {
            leftPointer++
            rightPointer--
        }
    }
    return true
}
