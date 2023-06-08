class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0; i<m; i++){
            int left = 0;
            int right = n-1;

            while(left<=right){
                int mid = left+(right -left)/2;
                if(grid[i][mid]<0){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            count +=n-left;
        }

        return count;
    }
}
     
