class Solution {
    public String intToRoman(int num) {
        String str = "";
        int [] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for(int i=values.length-1; i>=0 && num>0; i--){
            while(num>=values[i]){
                num = num - values[i];
                str = str + symbols[i];
            }
        }
        return str;
    }
}
