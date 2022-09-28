package medium

fun myPow(x: Double, n: Int): Double {
    var myX = x
    var myN = n

    if (myN < 0) {
        myN = -myN
        myX = 1 / myX
    }

    var pow = 1.0
    while (myN != 0) {
        if (myN and 1 != 0) {
            pow *= myX
        }
        myX *= myX
        myN = myN ushr 1
    }

    return pow
}
