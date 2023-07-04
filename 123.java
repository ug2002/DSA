class Solution {
    public int maxProfit(int[] prices) {
        int minP1 = Integer.MAX_VALUE;
        int minP2 = Integer.MAX_VALUE;
        int profit1 = 0;
        int profit2 = 0;
        for(int i=0; i<prices.length; i++){
            minP1 = Math.min(minP1, prices[i]);
            profit1 = Math.max(profit1, prices[i] - minP1);
            minP2 = Math.min(minP2, prices[i] - profit1);
            profit2 = Math.max(profit2, prices[i] - minP2);
        }
        System.out.println(profit1);
        System.out.println(profit2);
        return profit2;
    }
}
