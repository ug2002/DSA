class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount =0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])> maxCount)maxCount = map.get(nums[i]);
        }
        System.out.println(maxCount);
        //Create n number of list inside a list
        for(int i = 0; i < maxCount; i++){ 
            list.add(new ArrayList());
        }
        for(int key : map.keySet()){
            int all = map.get(key);
            for(int i = 0; i < all; i++){
                list.get(i).add(key); 
            }
        }
        return list;
    }
}

 
