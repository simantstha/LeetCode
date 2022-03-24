class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<Integer>();
        if(nums1.length>nums2.length)
        {
            for(int i = 0;i<nums2.length;i++)
            {
                for(int j=0;j<nums1.length;j++)
                {
                    if(nums1[j]!=-1212 && nums2[i]==nums1[j])
                    {
                        nums1[j]=-1212;
                        arr.add(nums2[i]);
                        break;
                    }
                }
            }
        }
        else
        {
            for(int i = 0;i<nums1.length;i++)
            {
                for(int j=0;j<nums2.length;j++)
                {
                    if(nums2[j]!=-1212 && nums1[i]==nums2[j])
                    {
                        nums2[j]=-1212;
                        arr.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] ar = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++)
            ar[i] = arr.get(i);
        return ar;
    }
}