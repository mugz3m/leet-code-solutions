package easy

import auxiliary.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return sortedArrayToBSTHelp(nums, 0, nums.lastIndex)
}

private fun sortedArrayToBSTHelp(nums: IntArray, leftPointer: Int, rightPointer: Int): TreeNode? {
    if (leftPointer > rightPointer)
        return null

    val middlePointer = (leftPointer + rightPointer) / 2

    val node = TreeNode(nums[middlePointer])
    node.left = sortedArrayToBSTHelp(nums, leftPointer, middlePointer - 1)
    node.right = sortedArrayToBSTHelp(nums, middlePointer + 1, rightPointer)

    return node
}
