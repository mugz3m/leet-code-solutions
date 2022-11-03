package easy

import auxiliary.ListNode

fun deleteDuplicates(head: ListNode?): ListNode? {
    return head?.let {
        var newHead: ListNode? = it
        var pointer: ListNode? = newHead?.next
        pointer?.let {
            while (newHead?.`val` == pointer?.`val`) {
                pointer = pointer?.next
            }
            newHead?.next = pointer
            if (pointer != null) {
                newHead = newHead?.next
                pointer = newHead?.next
                deleteDuplicates(newHead)
            }
        }
        head
    }
}
