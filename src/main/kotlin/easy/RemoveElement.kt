package easy

fun removeElement(nums: IntArray, `val`: Int): Int {
    var i = 0
    for (n in nums)
        if (n != `val`)
            nums[i++] = n
    return i
}
