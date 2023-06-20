class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        // 1 2 3 4
        // int arr[]
        // 1 2 3 4 
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i++){
            ans = Math.min(ans, nums[i+1] - nums[i]);
        }
        return ans;
    }
}
