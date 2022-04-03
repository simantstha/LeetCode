class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        while(true){
            n = sumSum(n);
            if(n == 1) return true;
            if(set.contains(n)) return false;
            set.add(n);
        }
    }
    public int sumSum(int n){
        int s = 0;
        while(n != 0){
            s += (n%10) * (n%10);
            n /= 10;
        }
        return s;
    }
}