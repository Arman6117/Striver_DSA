package _05_Arrays._01_Basics;

public class _02_BuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    static void main() {

    }
}
