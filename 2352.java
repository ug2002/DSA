class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            int j=0;
            List<Integer> columnLi=new ArrayList<>();
            while(j<grid.length){
                columnLi.add(grid[j][i]);
                j++;
            }
            System.out.println(columnLi);
            if(map.containsKey(columnLi)){
                map.put(columnLi, map.get(columnLi)+1);
            }
            else{
                map.put(columnLi, 1);
            }
        }
        int count =0;

        for(int i=0;i<grid.length;i++){
            List<Integer> rowLi=new ArrayList<>();
            for(int j=0; j<grid.length; j++){
                rowLi.add(grid[i][j]);
            }
            System.out.println(rowLi);
            if(map.containsKey(rowLi)){
                count = count + map.get(rowLi);
            }
        }
        return count;
    }
}

   
