package easy

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val hashSet = HashSet<Int>()
    for (i in nums.indices) {
        if (i > k) hashSet.remove(nums[i - k - 1])
        if (!hashSet.add(nums[i])) return true
    }
    return false
}
