class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while(right < prices.length){
            int currMax = prices[right] - prices[left];
            max = Math.max(currMax,max);
            if(prices[left] > prices[right]){
                left = right;
            }
            ++right;
        }
       return max;
    }
}
