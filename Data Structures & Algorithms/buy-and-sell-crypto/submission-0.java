class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int maxProfit = 0;
        for (int end=start+1; end<prices.length; end++){
            if(prices[end]<= prices[start]) {start = end; continue;}
            else {
                int sum=0;
                sum = prices[end] - prices[start];
                if(sum> maxProfit) maxProfit = sum;
            }
        }
        return maxProfit;
    }
}
