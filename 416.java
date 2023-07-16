class Solution {
    public boolean find (int index, int[]arr, int target, int[][]dp){
        if(target == 0){
            return true;
        }
        if(index == 0)return arr[0] == target;
        if(dp[index][target] !=-1)return dp[index][target] == 1? true:false;
        boolean notTake = find(index-1, arr, target, dp);
        boolean take = false;
        if(arr[index] <= target){
            take = find(index-1, arr, target - arr[index], dp);
        }
        dp[index][target] = notTake || take ? 1:0;
        return notTake || take;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int[][] dp = new int[nums.length][sum/2 + 1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        if(sum%2 != 0)return false;
        sum = sum/2;
        return find(nums.length-1, nums, sum, dp);
    }
}
