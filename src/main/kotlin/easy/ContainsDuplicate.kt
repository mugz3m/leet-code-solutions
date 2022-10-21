package easy

fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>()
    nums.forEach {
        if (hashSet.contains(it)) return true
        else hashSet.add(it)
    }

    return false
}
