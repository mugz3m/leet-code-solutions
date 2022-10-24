package easy

import auxiliary.binarySearch

fun searchInsert(nums: IntArray, target: Int): Int {
    return binarySearch(nums, target, 0, nums.lastIndex)
}
