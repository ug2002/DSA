class Solution {
    public int find(int idx1, int idx2, String txt1, String txt2, int [][] dp){
        if(idx1 < 0 || idx2 < 0)return 0;
        if(dp[idx1][idx2] !=-1)return dp[idx1][idx2];
        if(txt1.charAt(idx1) == txt2.charAt(idx2)){
            return dp[idx1][idx2] = 1 + find(idx1-1, idx2-1, txt1, txt2, dp);
        }
        return dp[idx1][idx2] =Math.max(find(idx1-1, idx2, txt1, txt2, dp), find(idx1, idx2-1, txt1, txt2, dp));
    }
    public int minDistance(String word1, String word2) {
        int idx1 = word1.length();
        int idx2 = word2.length();
        int dp[][] = new int[idx1][idx2];
        for(int i=0; i<idx1; i++){
            for(int j=0; j<idx2; j++){
                dp[i][j] = -1;
            }
        }
        int lcs =  find(idx1-1, idx2-1, word1, word2, dp);
        return idx1+idx2-(2*lcs);
    }
}
