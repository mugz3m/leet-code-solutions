package easy

open class VersionControl {
    companion object {
        private const val FIRST_BAD_VERSION = 5
    }

    open fun firstBadVersion(n: Int): Int = 0

    fun isBadVersion(version: Int): Boolean = version == FIRST_BAD_VERSION
}

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n
        var result = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (super.isBadVersion(mid)) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return result
    }
}
