class Solution {
    public int find(int row, int col, int[][]matrix, int[][]dp){

        if(col < 0 || col>matrix[0].length -1)return 10001;
        if(dp[row][col] !=Integer.MAX_VALUE)return dp[row][col];
        if(row==0)return matrix[row][col];
        int chkUp = matrix[row][col] + find(row-1, col, matrix, dp);
        int chkDL = matrix[row][col] + find(row-1, col-1, matrix, dp);
        int chkDR = matrix[row][col] + find(row-1, col+1, matrix, dp);
        return dp[row][col] = Math.min(chkUp, Math.min(chkDL, chkDR));
    }
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] dp = new int[row+1][col+1];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i =0; i<col; i++){
            min = Math.min(min, find(row-1, i, matrix, dp));
        }
        return min;
    }
}
