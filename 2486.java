class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;
        for(int a = 0; a<s.length(); a++){
            if(s.charAt(a) == t.charAt(count))
                count++;
            if(count == t.length()) return 0;
        }
        return t.length()-count;
    }
}
