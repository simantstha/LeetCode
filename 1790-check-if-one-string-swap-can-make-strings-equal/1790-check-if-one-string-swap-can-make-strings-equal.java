class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        if(s1.length()!=s2.length())
            return false;
        int count=0;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                arr.add(i);
            }
            if(count>2)
                return false;
        }
        if(count<2)
        {
           return s1.equals(s2);
        }
        else if(count==2)
        {
            if(s1.charAt(arr.get(0))==s2.charAt(arr.get(1)) && 
              s1.charAt(arr.get(1))==s2.charAt(arr.get(0)))
                return true;
            else 
                return false;
        }
        return false;
    }
}