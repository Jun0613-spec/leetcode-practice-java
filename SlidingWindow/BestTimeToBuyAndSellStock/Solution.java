package SlidingWindow.BestTimeToBuyAndSellStock;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices1 = {7,1,5,3,6,4}; //Output: 5
        int[] prices2 = {7,6,4,3,1}; //Output: 0

        System.out.println(solution.maxProfit(prices1));
        System.out.println(solution.maxProfit(prices2));
    }
    
    //Time O(n)
    //Spsace O(1)
    public int maxProfit(int[] prices) {
       
        
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0; i < prices.length; i++) {
          minPrice = Math.min(prices[i], minPrice);

          int profit = prices[i] - minPrice;

          maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
