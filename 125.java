class Solution {
    public boolean isPalindrome(String s) {
        String str1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = str1.length();
        String str2 = "";
        for (int i=0; i<n; i++)
          {
            char ch= str1.charAt(i);
            str2= ch+str2;
          }
        for(int i=0; i<n; i++){
            if(str1.charAt(i) != str2.charAt(i))return false;
        }
        return true;
    }
}
