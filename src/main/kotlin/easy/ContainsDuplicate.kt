package easy

fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>()
    nums.forEach {
        if (!hashSet.add(it)) return true
    }
    return false
}
