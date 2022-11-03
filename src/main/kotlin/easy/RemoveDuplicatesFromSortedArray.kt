package easy

fun removeDuplicates(nums: IntArray): Int {
    var insertIndex = 1
    for (i in 1 until nums.size) {
        if (nums[i - 1] != nums[i]) {
            nums[insertIndex] = nums[i]
            insertIndex++
        }
    }
    return insertIndex
}
