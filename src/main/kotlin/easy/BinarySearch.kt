package easy

import easy.auxiliary.binarySearch

fun search(nums: IntArray, target: Int): Int {
    val result = binarySearch(nums, target, 0, nums.lastIndex)
    return if (nums[result] == target) result
    else -1
}
