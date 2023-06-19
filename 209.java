  class Solution {
      public int minSubArrayLen(int target, int[] nums) {
          int i=0, j=0, n= nums.length, ans = Integer.MAX_VALUE, sum =0;
          while(j<n){
              sum = sum+nums[j];
              System.out.println(sum + " the index of j " + j);
              if(sum == target){
                  ans = Math.min(ans, j-i+1);
                  j++;
              }
              else if(sum < target){
                  j++;
              }
              else if(sum>target){ //for i =0; j=3
                  while(sum>target){
                      ans = Math.min(ans, j-i+1);
                      sum = sum-nums[i];
                      i++;

                  }
                  if(sum == target){
                      ans = Math.min(ans, j-i+1);
                  }
                  j++;
              }
          }
          if(ans == Integer.MAX_VALUE)return 0;
          return ans;  
      }
  }
}
