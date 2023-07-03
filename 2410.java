class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0;
        int count =0;
        for(int i=0; i<trainers.length; i++){
            if(j==players.length)return count;
            if(players[j] <= trainers[i]){
                count++;
                j++;
            }
        }
        return count;
    }
}
