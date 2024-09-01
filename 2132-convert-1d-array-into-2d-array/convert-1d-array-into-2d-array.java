class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int total = m * n;
        
        if (original.length != total) {
            return new int[0][0];
        }
        
        int[][] ans = new int[m][n];
        
        for (int i = 0; i < total; i++) {
            int col = i % n;
            int row = i / n;
            ans[row][col] = original[i];
        }
        
        return ans;
    }
}