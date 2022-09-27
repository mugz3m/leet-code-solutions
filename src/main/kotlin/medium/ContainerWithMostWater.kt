package medium

import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var leftIndex: Int = 0
    var rightIndex: Int = height.lastIndex
    var maxArea: Int = 0

    while (leftIndex < rightIndex) {
        val area: Int = (rightIndex - leftIndex) * min(height[leftIndex], height[rightIndex])
        maxArea = max(maxArea, area)

        if (height[leftIndex] < height[rightIndex]) {
            leftIndex++
        } else if (height[leftIndex] > height[rightIndex]) {
            rightIndex--
        } else {
            leftIndex++
            rightIndex--
        }
    }

    return maxArea
}
