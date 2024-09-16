package ArraysAndHashing.best_time_to_but_and_sell_stock2;

public class Solution {
     public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices1 = {7,1,5,3,6,4}; //Output: 7
        int[] prices2 = {1,2,3,4,5}; //Output: 4
    

        System.out.println(solution.maxProfit(prices1));
        System.out.println(solution.maxProfit(prices2));
     }

     public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            int prev = prices[i - 1];
            int curr = prices[i];

            if(prev < curr) {
                profit += curr - prev;
            }
        }

        return profit;
     } 
}
