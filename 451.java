class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        String str = "";
        while(pq.size() > 0){
            char ch = pq.remove();
            int x = map.get(ch);
            while(x>0){
                str = str + ch;
                x--;
            }
        }
        return str;
    }
}
