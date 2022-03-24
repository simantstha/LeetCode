class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max)
                max=salary[i];
            else if(salary[i]<min)
                min=salary[i];
            sum+=salary[i];
        }
        return (sum-max-min)/(salary.length-2);
    }
}