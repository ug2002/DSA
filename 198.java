class Solution {
    public int find(int index, int[] nums, int [] dp){
        if(index == 0){
            return nums[index];
        }
        if(index < 0)return 0;
        if(dp[index] != -1)return dp[index];
        int pick = nums[index] + find(index-2, nums, dp);
        int notPick = 0 + find(index-1, nums, dp);
        return dp[index] = Math.max(pick, notPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);
        return find(n-1, nums, dp);
    }
}
