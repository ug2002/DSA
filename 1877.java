class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int max =0;
        for(int i=0; i<=n; i=i+2){
            int sum = nums[i] + nums[n-i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
//2 3 4 4 5 6
   
