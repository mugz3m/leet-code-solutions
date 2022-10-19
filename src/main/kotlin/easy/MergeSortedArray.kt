package easy

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var firstPointer = m - 1
    var secondPointer = n - 1
    var resultPointer = m + n - 1
    while (secondPointer >= 0) {
        if (firstPointer >= 0 && nums1[firstPointer] > nums2[secondPointer]) {
            nums1[resultPointer--] = nums1[firstPointer--]
        } else {
            nums1[resultPointer--] = nums2[secondPointer--]
        }
    }
}
