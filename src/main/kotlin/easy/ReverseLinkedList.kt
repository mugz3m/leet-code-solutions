package easy

import auxiliary.ListNode

fun reverseList(head: ListNode?): ListNode? {
    return reverseListInt(head, null)
}

private fun reverseListInt(head: ListNode?, newHead: ListNode?): ListNode? {
    if (head == null) return newHead
    val next = head.next
    head.next = newHead
    return reverseListInt(next, head)
}
