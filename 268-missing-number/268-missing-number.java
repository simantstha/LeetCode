class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int sum1=nums.length*(nums.length+1)/2;
        return sum1-sum;
        
    }
}