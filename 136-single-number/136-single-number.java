class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0 ;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count=map.get(nums[i]);
                map.put(nums[i],++count);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int n=0;
        for(Integer key : map.keySet()){
            if(map.get(key)==1){
                n=key;
                break;
            }
        }
        return n;
    }
}