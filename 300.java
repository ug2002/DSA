class Solution {
    public int find(int idx, int prevInd, int[]nums, int[][]dp){
        if(idx == nums.length)return 0;

        if(dp[idx][prevInd+1] != -1)return dp[idx][prevInd+1];
        int notPick = find(idx+1, prevInd, nums, dp);
        int pick = 0;
        if(prevInd == -1 || nums[idx] > nums[prevInd]){
            pick = 1 + find(idx +1, idx, nums, dp);
        }
        return dp[idx][prevInd+1] = Math.max(notPick, pick);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                dp[i][j] = -1;
            }
        }
        return find(0, -1, nums, dp);
    }
}
