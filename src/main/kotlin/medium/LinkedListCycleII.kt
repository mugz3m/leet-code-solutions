package medium

import easy.auxiliary.ListNode

fun detectCycle(head: ListNode?): ListNode? {
    if (head?.next == null) return null

    var fast = head
    var slow = head
    var entry = head

    while (fast!!.next != null && fast.next!!.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
        if (slow == fast) {
            while (slow != entry) {
                slow = slow!!.next
                entry = entry!!.next
            }
            return entry
        }
    }
    return null
}
