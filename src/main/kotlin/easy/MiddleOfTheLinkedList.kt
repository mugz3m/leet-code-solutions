package easy

import easy.auxiliary.ListNode

fun middleNode(head: ListNode?): ListNode? {
    var slow: ListNode? = head
    var fast: ListNode? = head
    while (fast?.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
    }
    return slow
}
