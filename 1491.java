class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = 0;
        for(int i=0; i<salary.length; i++){
            if(salary[i] < min)min = salary[i];
            if(salary[i] > max)max= salary[i];
            sum = sum + salary[i];
        }
        return (sum-max-min)/(salary.length-2);
    }
}
