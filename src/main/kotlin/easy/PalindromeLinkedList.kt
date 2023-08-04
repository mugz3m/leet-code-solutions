package easy

import auxiliary.ListNode

fun isPalindrome(head: ListNode?): Boolean {
    var slowPointer = head
    var fastPointer = head

    while (fastPointer?.next != null) {
        slowPointer = slowPointer!!.next
        fastPointer = fastPointer.next!!.next
    }

    val reversedListHead = reverseList(slowPointer)

    fastPointer = head
    slowPointer = reversedListHead
    while (slowPointer != null) {
        if (fastPointer!!.`val` != slowPointer.`val`)
            return false

        fastPointer = fastPointer.next
        slowPointer = slowPointer.next
    }

    return true
}
