class Solution {
    public String removeStars(String s) {
        Stack<Character> res = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) != '*'){
                res.add(s.charAt(i));
            }
            else{
                res.pop();
            }
        }
        while(!res.isEmpty()){
            sb.append(res.pop());
        }
        return sb.reverse().toString();
        
    }
}
