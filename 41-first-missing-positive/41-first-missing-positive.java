class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];
            hm.put(nums[i],1);  
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!hm.containsKey(i)&&i!=0)
            {
                return i;
            }
            
        }
        return nums.length+1;
    }
}