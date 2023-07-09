class Solution {
    public int find(int index, int[] nums, int[]dp){
        if(index == 0)return nums[index];
        if(index<0)return 0;
        if(dp[index] !=-1)return dp[index];
        int pick = nums[index] + find(index-2, nums, dp);
        int notPick = 0 + find(index-1, nums, dp);
        return dp[index] = Math.max(pick, notPick);
    }
    public int rob(int[] nums) {
        if(nums.length ==1)return nums[0];
        
        int n= nums.length;
        int dp[] = new int [n];


        int [] arr1 = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr1[i] = nums[i];
        }
        Arrays.fill(dp, -1);
        int ans1 = find(n-2, arr1, dp);


        int [] arr2 = new int[n-1];
        for(int i=1; i<=n-1; i++){
            arr2[i-1] = nums[i];
        }
        Arrays.fill(dp, -1);
        int ans2 = find(n-2, arr2, dp);


        return Math.max(ans1, ans2);
    }
}
