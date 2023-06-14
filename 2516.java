class Solution {
    public int takeCharacters(String s, int k) {
        int countA =0, countB=0, countC=0; //for tc1- a = 8, b = 2, c = 2
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a')countA++;
            else if(ch == 'b')countB++;
            else countC++;
        }
        countA = countA-k; //a = 6
        countB = countB-k; //b = 0 
        countC = countC-k; //c = 0
        if(countA<0 || countB<0 || countC<0)return -1;

        // we need to find a substring with max value of char a, b, c = a, b,c;
        int maxAns = 0, tempAns =0, cA =0, cB =0, cC=0, j=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a')cA++; //1->2
            else if(ch == 'b')cB++; //->1
            else cC++; 

            while(cA>countA){
                if(s.charAt(j) != 'a'){
                    if(s.charAt(j) == 'b'){
                        cB--;
                        j++;
                    }
                    if(s.charAt(j) == 'c'){
                        cC--;
                        j++;
                    }
                }
                else{
                    cA--;
                    j++;
                }
            }
            while(cB>countB){//one cB == 1, we will come here
                if(s.charAt(j) != 'b'){
                    if(s.charAt(j) == 'a'){
                        cA--;
                        j++;
                    }
                    if(s.charAt(j) == 'c'){
                        cC--;
                        j++;
                    }
                }
                else{
                    cB--;
                    j++;
                }                
            }
            while(cC>countC){
                if(s.charAt(j) != 'c'){
                    if(s.charAt(j) == 'a'){
                        cA--;
                        j++;
                    }
                    if(s.charAt(j) == 'b'){
                        cB--;
                        j++;
                    }
                }
                else{
                    cC--;
                    j++;
                }
            }

            maxAns = Math.max(maxAns, i-j+1); // max Substring of size 2 after removing B.

        }

        return s.length()- maxAns;

    }
}
