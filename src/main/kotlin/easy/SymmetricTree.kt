package easy

import auxiliary.TreeNode

fun isSymmetric(root: TreeNode?): Boolean {
    return isSymmetricHelp(root!!.left, root.right)
}

private fun isSymmetricHelp(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null || right == null)
        return left == right

    return if (left.`val` != right.`val`) {
        false
    } else {
        isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left)
    }
}
