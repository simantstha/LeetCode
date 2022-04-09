class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                int count= hmap.get(nums[i]);
                hmap.put(nums[i],++count);
            }
            else
            {
                hmap.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> hmap.get(b) - hmap.get(a));
        for(int key : hmap.keySet()){
            maxHeap.add(key);
        }
        
        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = maxHeap.poll();
        }
        return res;
        
    }
}