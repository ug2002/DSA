//ASCII VALUE OF a IS 97
class Solution {
    public int longestContinuousSubstring(String s) {
        int max =1;
        int count =1;
        if(s.length() == 1)return 1;
        for(int i=1; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i-1);
            if((c1 - c2) ==1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count =1;
            }
        }
        return max;
    }
}
// abcde

