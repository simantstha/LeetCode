class Solution {
    public String reverseStr(String ss, int k) {
        char[] s = ss.toCharArray();
        for(int i = 0;i<s.length;i+=2*k)
        {
            int st = i;
            int end=Math.min(i+k-1,s.length-1);
            while(st<end)
            {
                char temp = s[st];
                s[st++] = s[end];
                s[end--]=temp;
            }
        }
        return new String(s);
    }
}