class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr, -1);
        int size = 2*k+1;
        if(n<size)return arr;
        int s = 0;
        int e = size -1;
        long sum =0;
        for(int i=0; i<size-1; i++ ){
            sum = sum + nums[i];
        }
        for(int i = k; i<n; i++){
            if(i+k >=n)break;
            // System.out.println(sum);
            sum = sum + nums[e++];
            arr[i] = (int)(sum/size);
            sum = sum - nums[s++];
        }
        /*
        if(k==0)return nums;
        for(int i=0; i<n; i++){ //i=3
            if(i-k<0 || i+k>=n){
                arr[i] = -1;
                // break;
            }
            else{
            int s = i-k;
            int e = i+k;
            int sum =nums[i];
            while(s<e){
                sum = sum + nums[s] + nums[e];
                s++;
                e--;
            }
            arr[i] = sum/(2*k+1);
            }
            
        }
        */
        return arr;
    }
}
