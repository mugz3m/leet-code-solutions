package medium

fun search(nums: IntArray, target: Int): Int {
    var leftIndex = 0
    var rightIndex = nums.size
    while (leftIndex < rightIndex) {
        val middleIndex = (leftIndex + rightIndex) / 2

        val number = when {
            (nums[middleIndex] < nums[0]) == (target < nums[0]) -> nums[middleIndex]
            target < nums[0] -> Int.MIN_VALUE
            else -> Int.MAX_VALUE
        }

        when {
            number == target -> return middleIndex
            number < target -> leftIndex = middleIndex + 1
            else -> rightIndex = middleIndex
        }
    }

    return -1
}
