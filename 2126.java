class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mASS = (long)mass;
        for(int i=0; i<asteroids.length; i++){
            long aSTEROIDS=(long)asteroids[i];
            if(mASS < aSTEROIDS)return false;
            else{
                mASS = mASS + aSTEROIDS;
            }
        }
        return true;
    }
}
