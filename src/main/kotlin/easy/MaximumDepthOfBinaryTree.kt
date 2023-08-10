package easy

import auxiliary.TreeNode
import kotlin.math.max

fun maxDepth(root: TreeNode?): Int {
    if (root == null)
        return 0

    val maxDepthLeft = maxDepth(root.left)
    val maxDepthRight = maxDepth(root.right)
        
    return max(maxDepthLeft, maxDepthRight) + 1
}
