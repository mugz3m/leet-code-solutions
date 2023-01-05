package medium

import java.util.*
import kotlin.collections.ArrayList

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return ArrayList<ArrayList<String>>()
    val result = HashMap<String, ArrayList<String>>()
    for (s in strs) {
        val charArray = s.toCharArray()
        Arrays.sort(charArray)
        val key = String(charArray)
        if (!result.containsKey(key)) result[key] = ArrayList()
        result[key]!!.add(s)
    }
    return ArrayList(result.values)
}
