class Solution {
    public int numberOfBeams(String[] bank) {
        int sum =0;
        int prev = 0;
        for(int i=0; i<bank.length; i++){
            String str1 = bank[i];
            int count =0;
            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j) == '1')count++;
            }
            if(count>0){
                sum += prev*count;
                prev = count;
            }
            System.out.println(sum);
        }
        return sum;
    }
}
