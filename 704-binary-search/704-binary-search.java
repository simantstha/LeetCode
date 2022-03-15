class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public int binarySearch(int[] arr, int l, int r, int target)
    {
        if(r >= l)
        {
            int mid = (l + r)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid]>target)
                return binarySearch(arr,l,mid-1,target);
            return binarySearch(arr,mid+1,r,target);
        }
        return -1;
    }
}