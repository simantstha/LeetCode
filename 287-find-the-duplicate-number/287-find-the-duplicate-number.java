class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> tab = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(tab.containsKey(nums[i]))
                return nums[i];
            else
                tab.put(nums[i],1);
        }
        return 0;
    }
}