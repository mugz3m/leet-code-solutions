package easy

fun missingNumber(nums: IntArray): Int {
    var result = 0
    for (i in nums.indices) {
        result = result xor i xor nums[i]
    }

    return result xor nums.size
}
