class Solution {
    public int find(int[] arr, int amount, int idx, int dp[][]){

        if(idx == 0){
            if(amount%arr[idx] == 0)return dp[idx][amount] =  amount/arr[idx];
            else {
                return (int)Math.pow(10,9);
            }
        }
        if(dp[idx][amount] != -1)return dp[idx][amount];


        int notPick = 0 + find(arr, amount, idx-1, dp);
        int pick = Integer.MAX_VALUE;
        if(arr[idx] <= amount){
            pick = 1 + find(arr, amount - arr[idx], idx, dp);
        }


        return dp[idx][amount] = Math.min(notPick, pick);


    }
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        int res = find(coins, amount, coins.length-1, dp);
        if(res >= (int)Math.pow(10,9)){
            return -1;
        }
        return res;
    }
}
