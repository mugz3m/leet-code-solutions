package easy

fun isIsomorphic(s: String, t: String): Boolean {
    val hashMapStoT = hashMapOf(s[0] to t[0])
    val hashMapTtoS = hashMapOf(t[0] to s[0])

    for (i in s.indices) {
        if (hashMapEqualOrNull(hashMapStoT, s[i], hashMapTtoS, t[i])) {
            hashMapStoT[s[i]] = t[i]
            hashMapTtoS[t[i]] = s[i]
        } else return false
    }

    return true
}

fun hashMapEqualOrNull(
    hashMapFirst: HashMap<Char, Char>,
    hashMapFirstKey: Char,
    hashMapSecond: HashMap<Char, Char>,
    hashMapSecondKey: Char
): Boolean {
    return hashMapFirst[hashMapFirstKey] == hashMapSecondKey && hashMapSecond[hashMapSecondKey] == hashMapFirstKey || hashMapFirst[hashMapFirstKey] == null && hashMapSecond[hashMapSecondKey] == null
}
