class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        if(nums2.length!=0)
        {
            for(int i=m;i<m+n;i++)
            {
                nums1[i]=nums2[count++];
            }
        }
        Arrays.sort(nums1);
    }
}