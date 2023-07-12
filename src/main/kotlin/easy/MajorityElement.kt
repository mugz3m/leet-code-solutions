package easy

fun majorityElement(nums: IntArray): Int {
    var major = nums.first()
    var counter = 0
    for (num in nums) {
        when {
            counter == 0 -> {
                major = num
                counter++
            }

            major == num -> counter++
            else -> counter--
        }
    }

    return major
}
