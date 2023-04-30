//TLE
class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int b[] = nums.clone();
        Arrays.sort(b);
        // nums = -1,3,4
        // b = -1 3 4
        int j = 0;
        int p=0;
        long ans = 1;
        while(p!=nums.length-1){
        if(b[j] == nums[p]){
            ans++;
            j++;
            p++;

        }
        else{
            shift(nums, p);
            ans++;
        }
        }
        return ans;
    }
    public int [] shift(int [] arr, int start){
        int temp = arr[start];
        for(int i=start + 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
