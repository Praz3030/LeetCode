class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int i = 0 ; i <= n ; i++) {
            ans[i] = cal_one(i);
        }
        return ans;
    }

    public int cal_one(int n) {
        String str = Integer.toBinaryString(n);

        int cnt = 0;

        for(char c : str.toCharArray()) {
            if (c == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}