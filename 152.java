class Solution {
    public int maxProduct(int[] nums) {
        int maxProductR = Integer.MIN_VALUE;
        int prod =1;
        for(int i=0; i<nums.length-1; i++){
            // currProduct = nums[i]*nums[i+1];
            prod = prod*nums[i];
            maxProductR =Math.max(maxProductR, prod);   
            if(prod == 0)prod =1;         
        }

        int maxProductL = Integer.MIN_VALUE;
        prod =1;
        for(int i=nums.length-1; i>=0; i--){
            // currProduct = nums[i]*nums[i+1];
            prod = prod*nums[i];
            maxProductL =Math.max(maxProductL, prod);    
            if(prod == 0)prod =1;         
        }
        return Math.max(maxProductR, maxProductL);
    }
}
