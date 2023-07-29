package easy

fun moveZeroes(nums: IntArray) {
    var zerosNumber = 0
    for (i in nums.indices) {
        if (nums[i] == 0) {
            zerosNumber++
        } else {
            val newIndex = i - zerosNumber
            nums[newIndex] = nums[i]
            for (j in newIndex + 1 .. newIndex + zerosNumber) {
                nums[j] = 0
            }
        }
    }
}
