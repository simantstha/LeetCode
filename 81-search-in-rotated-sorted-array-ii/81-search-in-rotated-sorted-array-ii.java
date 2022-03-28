class Solution {
    public boolean search(int[] nums, int target) {
        int j = nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target||nums[j]==target)
            {
                return true;
            }
            j--;
        }
        return false;
        
    }
   
}