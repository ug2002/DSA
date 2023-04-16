class Solution {
    public int addMinimum(String word) {
        // Stack<Character> st = new Stack<>();
        int count =0;
        int n = word.length();
        int i=0;
        while(i<n){
            char ch = word.charAt(i);
            if(ch == 'a'){
                if(i+1 < n && word.charAt(i+1) == 'b' && i+2 <n && word.charAt(i+2) == 'c'){
                    i = i+3;
                }
                else if(i+1<n && word.charAt(i+1) == 'b'){
                    count++;
                    i = i+2;
                }
                else if(i+1<n && word.charAt(i+1) =='c'){
                    count++;
                    i = i+2;
                }
                else{
                    count = count+2;
                    i++;
                } 
            }
            else if(ch == 'b'){
                count++;
                if(i+1<n && word.charAt(i+1) =='c'){
                    i+=2;
                }
                else{
                    i++;
                    count++;
                }
            }
            else{
                count+=2;
                i++;
            }
        }
       return count;

    }
}
