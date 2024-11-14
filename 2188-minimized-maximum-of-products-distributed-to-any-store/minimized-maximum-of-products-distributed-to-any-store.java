class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int l = 1;
        int r = 0;
        
        for (int quantity : quantities) {
            r = Math.max(r, quantity);
        }
        
        while (l < r) {

            int mid = l + (r - l) / 2;
            
            if (distribute(mid, n, quantities)) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        
        return l;
    }
    
    private boolean distribute(int x, int n, int[] quantities) {

        int ans = 0;
        
        for (int quantity : quantities) {
            ans += (int) Math.ceil((double) quantity / x);
        }
        return ans <= n;
    }
}