package hard

import auxiliary.ListNode
import java.util.*

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    if (lists.isEmpty()) return null

    val queue = PriorityQueue<ListNode>(lists.size) { node1, node2 ->
        when {
            node1.`val` < node2.`val` -> -1
            node1.`val` == node2.`val` -> 0
            else -> 1
        }
    }

    val dummy = ListNode(0)
    var tail: ListNode = dummy

    lists.forEach { list ->
        list?.let { queue.add(it) }
    }

    while (!queue.isEmpty()) {
        tail.next = queue.poll()
        tail = tail.next!!

//        if (tail.next != null)
//            queue.add(tail.next)
    }

    return dummy.next
}
