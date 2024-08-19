class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;

        int ans = 0;

        for (int i = 2; i <= n; i++) {
            if ( n == 1) break;
            while (n % i == 0) {
                ans += i;
                n /= i;
            }
        }  
        return ans;
    }
}