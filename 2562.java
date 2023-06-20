class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0, j = nums.length-1;
        long sum =0;
        while(i<=j){
            String str = "";
            if(i == j)return sum + nums[i]; 
            str = str + nums[i] + nums[j];
            System.out.println(str);
            sum = sum + Long.parseLong(str);
            i++;
            j--;
        }
        return sum;
    }
}
