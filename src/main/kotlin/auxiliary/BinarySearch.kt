package auxiliary

fun binarySearch(nums: IntArray, target: Int, startIndex: Int, endIndex: Int): Int {
    val middleIndex = (startIndex + endIndex) / 2

    if (startIndex < endIndex) {
        if (target == nums[middleIndex]) return middleIndex
        if (target < nums[middleIndex]) return binarySearch(nums, target, startIndex, middleIndex - 1)
        if (target > nums[middleIndex]) return binarySearch(nums, target, middleIndex + 1, endIndex)
    }
    return startIndex
}
