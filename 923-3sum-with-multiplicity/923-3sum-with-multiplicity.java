class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long res = 0,mod = 1000000007;
        long[] freq = new long[101];
        for(int i:arr) freq[i]++;
        for(int i=0;i<=100;i++)
            for(int j=i;j<=100;j++){
                int k = target-i-j;
                if(k<0 || k>100) continue;
                if(i == j && j == k) res += (freq[i] * (freq[i]-1) * (freq[i]-2) / 6);
                else if(i == j && j != k) res += ((freq[i] * (freq[i]-1) / 2) * freq[k]);
                else if(i < j && j < k) res += freq[i] * freq[j] * freq[k];
            }
        return (int)(res%mod);
    }
    }
