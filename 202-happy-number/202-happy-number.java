class Solution {
    public int happy(int n)
    {
        int rem=0;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum+=(rem*rem);
            n/=10;
            
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int result=n;
        while(result!=1&&result!=4)
        {
            result=happy(result);
        }
        if(result==1)
            return true;
        else
            return false;
        
    }
}