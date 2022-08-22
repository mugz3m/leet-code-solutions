package easy

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) return 0

    var overallProfit = 0
    var lowestPrice = prices[0]
    prices.forEach { todayPrice ->
        lowestPrice = kotlin.math.min(lowestPrice, todayPrice)
        overallProfit = kotlin.math.max(todayPrice - lowestPrice, overallProfit)
    }

    return overallProfit
}
