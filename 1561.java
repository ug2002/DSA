class Solution {
    public int maxCoins(int[] piles) {
        // 1 2 3 4 5 6 7 8 9 
        // 1 2 2 4 7 8
        Arrays.sort(piles);
        int n = piles.length-1;
        int ans =0;
        int i=0; 
        int j = n;
        while(i<j){
            j--;
            ans = ans + piles[j--];
            i++;
        }
        return ans;
    }
}
