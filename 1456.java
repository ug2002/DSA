class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int maxCount = 0, currCount=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                currCount = currCount + 1;
            };
            if(i>=k)
                if(set.contains(s.charAt(i-k))){
                currCount = currCount - 1;
            };
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;    
    }
}
