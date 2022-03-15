class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        boolean flag = false;
        for(int i = 0; i < nums.length; i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                flag = true;
                break;
            }
            hmap.put(nums[i],1);
        }
        return flag;
    }
}