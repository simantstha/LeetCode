class Solution {
    public int maxArea(int[] height) {
       int first=0;
       int last= height.length-1;
       int area=0;
       while(first<=last)
       {
           area = Math.max(area, (last - first) * Math.min(height[first], height[last]));
            if (height[first] < height[last])
				first += 1;
            else
				last -= 1;
       }
        return area;
    }
}