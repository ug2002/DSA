class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(')return false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else if(ch == '*'){
                star.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(st.isEmpty() && !star.isEmpty()){
                    star.pop();
                }
                else return false;
            }
        }
        if(!st.isEmpty() && star.isEmpty())return false;
        while(!st.isEmpty()){
            if(star.isEmpty())return false;
            if(star.peek() > st.peek()){
                star.pop();
                st.pop();
            }
            else return false;
        }
        return st.isEmpty();
    }
}
