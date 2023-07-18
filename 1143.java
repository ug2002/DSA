class Solution {
    public int find(int idx1, int idx2, String txt1, String txt2, int [][]dp){

        if(idx1<0 || idx2 <0)return 0;

        if(dp[idx1][idx2] !=-1)return dp[idx1][idx2];

        if(txt1.charAt(idx1) == txt2.charAt(idx2)){
            return dp[idx1][idx2] = 1 + find(idx1-1, idx2-1, txt1, txt2, dp);
        }

        return dp[idx1][idx2] = Math.max(find(idx1-1, idx2, txt1, txt2, dp), find(idx1, idx2-1, txt1, txt2, dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int index1 = text1.length();
        int index2 = text2.length();
        int dp[][] = new int[index1][index2];
        for(int i=0; i<index1; i++){
            for(int j=0; j<index2; j++){
                dp[i][j] = -1;
            }
        }
        return find(index1-1, index2-1, text1, text2, dp);
    }
}
