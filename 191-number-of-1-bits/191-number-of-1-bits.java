public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String[] arr= Integer.toBinaryString(n).split("");
        int count=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i].equals("1"))
                count++;
        }
        return count;
    }
}