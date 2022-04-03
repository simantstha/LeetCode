public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <=1) {
            return;
        }
        
        int i=nums.length-1;
        while(i > 0 && nums[i] <= nums[i-1]) {
            i--;
        }
        
        if(i == 0) {
            reverse(nums, 0, nums.length-1);
            return;
        }
        
        int target = nums[i-1];
        for(int j=i; j<nums.length; j++) {
            if(j == nums.length-1 || nums[j] > target && nums[j+1] <= target) {
                int temp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = temp;
                break;
            }
        }
        
        reverse(nums, i, nums.length-1);
    }
    
    private void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}