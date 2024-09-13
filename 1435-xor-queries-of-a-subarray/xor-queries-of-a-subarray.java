class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = queries.length;

        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int result = 0;
            
            for (int j = left; j <= right; j++) {
                result ^= arr[j];
            }
            
            ans[i] = result;
        }
        
        return ans;
    }
}