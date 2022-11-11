package medium

import kotlin.math.max

fun canJump(nums: IntArray): Boolean {
    var currentPointIndex = 0
    for (i in nums.indices) {
        if (i > currentPointIndex) return false
        currentPointIndex = max(currentPointIndex, i + nums[i])
    }
    return true
}
