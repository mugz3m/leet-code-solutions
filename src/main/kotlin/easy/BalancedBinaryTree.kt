package easy

import auxiliary.TreeNode
import kotlin.math.abs
import kotlin.math.max

fun isBalanced(root: TreeNode?): Boolean {
    if (root == null)
        return true

    return isBalancedHelper(root) != -1;
}

private fun isBalancedHelper(node: TreeNode?): Int {
    if (node == null) return 0

    val left = isBalancedHelper(node.left)
    if (left == -1) return -1

    val right = isBalancedHelper(node.right)
    if (right == -1) return -1

    if (abs(left - right) > 1) return -1

    return max(left, right) + 1
}
