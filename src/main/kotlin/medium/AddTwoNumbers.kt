package medium

import auxiliary.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var firstPointer = l1
    var secondPointer = l2
    val tail = ListNode(0)
    var head = tail
    var remainder = 0
    while (firstPointer != null || secondPointer != null || remainder != 0) {
        val x = firstPointer?.`val` ?: 0
        val y = secondPointer?.`val` ?: 0
        val sum = x + y + remainder
        remainder = sum / 10

        head.next = ListNode(sum % 10)
        head = head.next!!
        firstPointer = firstPointer?.next
        secondPointer = secondPointer?.next
    }

    return tail.next
}
