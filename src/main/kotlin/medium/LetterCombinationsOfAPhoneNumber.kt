package medium

fun letterCombinations(digits: String): List<String> {
    if (digits.isEmpty()) return ArrayList()

    var result = ArrayList<String>()

    digits.forEach {
        when(it) {
            '2' -> result = addCombination(result, "abc")
            '3' -> result = addCombination(result, "def")
            '4' -> result = addCombination(result, "ghi")
            '5' -> result = addCombination(result, "jkl")
            '6' -> result = addCombination(result, "mno")
            '7' -> result = addCombination(result, "pqrs")
            '8' -> result = addCombination(result, "tuv")
            '9' -> result = addCombination(result, "wxyz")
            else -> {}
        }
    }

    return result

}

fun addCombination(result: List<String>, buttonLetterCombination: String): ArrayList<String> {
    val newResultList = ArrayList<String>()

    if (result.isNotEmpty()) {
        result.forEach { listElement ->
            buttonLetterCombination.forEach { letter ->
                newResultList.add(listElement + letter)
            }
        }
    } else {
        buttonLetterCombination.forEach {
            newResultList.add(it.toString())
        }
    }

    return newResultList
}
