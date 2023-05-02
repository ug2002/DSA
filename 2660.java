class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int player1Score = findScore(player1);
        int player2Score = findScore(player2);
        if(player1Score > player2Score)return 1;
        if(player1Score < player2Score)return 2;
        return 0;
    }
    public int findScore(int arr[]){
        int n = arr.length;
        int sum =arr[0];
        if(n == 1)return sum;
        if(arr[0] == 10){
            sum = sum + 2*arr[1]; 
        }
        else{
            sum =arr[0] + arr[1];
        }
        if(n == 2)return sum;
        int count=0;
        for(int i=2; i<n; i++){
            if(arr[i-1] ==10 || arr[i-2] ==10){
                sum = sum + 2*arr[i];
            }
            else{
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
