package easy

fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0))
        return false

    var xOrdered: Int = x
    var xInverted: Int = 0
    while (xOrdered > xInverted) {
        xInverted = xInverted * 10 + xOrdered % 10
        xOrdered /= 10
    }

    return xOrdered == xInverted || xOrdered == xInverted / 10
}
