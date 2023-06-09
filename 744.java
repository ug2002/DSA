class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if((letters[letters.length-1] - target) <=0)return letters[0];
        for(int i=0; i<letters.length; i++){
            if((target - letters[i]) <0 ){
                return letters[i];
            }
            else if((target - letters[i]) == 0 && letters[i+1] != target){
                return letters[i+1];
            }
        }
        return letters[0];
    }
}
