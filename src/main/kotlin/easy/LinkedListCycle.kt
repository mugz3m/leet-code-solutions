package easy

import easy.auxiliary.ListNode

fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) return false

    var fast = head
    var slow = head

    while (fast!!.next != null && fast.next!!.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
        if (slow == fast) return true
    }
    return false
}
