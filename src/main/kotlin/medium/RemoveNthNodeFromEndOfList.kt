package medium

import auxiliary.ListNode

fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {
    var fast: ListNode? = head
    var slow: ListNode? = head

    for (i in 0 until n)
        fast = fast!!.next

    if (fast == null)
        return head.next

    while (fast!!.next != null) {
        fast = fast.next
        slow = slow!!.next
    }

    slow!!.next = slow.next!!.next

    return head
}
