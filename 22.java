class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        genPar("(", 1, 0, ans, n); //(current, open brackets, close brackets, ans, n);
        return ans;
    }
    public static void genPar(String current, int open, int close, List<String> ans, int n){

        if(current.length() == 2*n){
            ans.add(current);
            return;
        }
        if(open<n){
            genPar(current + "(", open+1, close, ans, n);
        }
        if(close<open){
            genPar(current + ")", open, close +1, ans, n);
        }
    }
}
