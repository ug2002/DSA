class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> li = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count =0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                li.add(matrix[i][j]);
            }
        }
        Collections.sort(li);
        return li.get(k-1);
    }
}
