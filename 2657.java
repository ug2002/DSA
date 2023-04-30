class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int len1 = A.length;
    int len2 = B.length;
    int [] ans = new int [len1]; 
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();
    for (int i = 0; i < len1; i++) {
            s1.add(A[i]);
            s2.add(B[i]);
            int count =0;
            for (int j : s1) {
                if (s2.contains(j)) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
