public class stockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy at lower price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // sell for profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
