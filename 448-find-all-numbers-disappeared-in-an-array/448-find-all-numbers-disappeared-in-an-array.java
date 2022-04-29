class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
               map.put(nums[i],1); 
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}