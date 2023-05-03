class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();    
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i=0; i<nums1.length; i++)s1.add(nums1[i]);
        for(int i=0; i<nums2.length; i++)s2.add(nums2[i]);
        for(int i=0; i<nums1.length; i++){
            if(!s2.contains(nums1[i])){
                if(!ans1.contains(nums1[i]))ans1.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(!s1.contains(nums2[i])){
                if(!ans2.contains(nums2[i]))ans2.add(nums2[i]);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
