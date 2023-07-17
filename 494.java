class Solution {
    public int find(int index, int target, int []arr, int sum,){
        if(index < 0){
            if(sum == target)return 1;
            else return 0;
        }
        int minus = find(index-1, target, arr, sum - arr[index]);
        int plus = find(index-1, target, arr, sum + arr[index]);
        return minus + plus;

    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int dp [][] = new int[n][target+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<target+1; j++){
                dp[i][j] = -1;
            }
        }
        return find(n-1, target, nums, 0, dp);
    }
}
