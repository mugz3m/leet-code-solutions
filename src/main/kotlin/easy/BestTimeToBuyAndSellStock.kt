package easy

fun maxProfit(prices: IntArray): Int {
    var lastBuyPrice = Int.MAX_VALUE
    var todayProfit: Int
    var overallProfit = 0

    for (todayPrice in prices) {
        if (todayPrice< lastBuyPrice) {
            lastBuyPrice = todayPrice
        }
        todayProfit = todayPrice - lastBuyPrice
        if (todayProfit > overallProfit) {
            overallProfit = todayProfit
        }
    }
    return overallProfit
}
