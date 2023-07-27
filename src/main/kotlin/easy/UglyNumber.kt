package easy

fun isUgly(n: Int): Boolean {
    var num = n
    var i = 2
    while (i < 6 && num > 0) {
        while (num % i == 0) {
            num /= i
        }
        i++
    }

    return num == 1
}
