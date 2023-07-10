package easy

fun climbStairs(n: Int): Int {
    if (n == 1) return 1
    if (n == 2) return 2

    var twoStepsBefore = 1
    var oneStepBefore = 2

    for (i in 3 until n) {
        val tmp = oneStepBefore + twoStepsBefore
        twoStepsBefore = oneStepBefore
        oneStepBefore = tmp
    }

    return oneStepBefore + twoStepsBefore
}
