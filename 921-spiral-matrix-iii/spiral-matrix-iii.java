class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;
        int steps = 1;

        int totalSteps = rows * cols;
        int[][] ans = new int[totalSteps][2];
        
        int index = 0;
        int row = rStart, col = cStart;

        while (index < totalSteps) {
            for (int i = 0; i < steps; i++) {
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    ans[index++] = new int[]{row, col};
                }
                row += directions[direction][0];
                col += directions[direction][1];
            }
            direction = (direction + 1) % 4;
            if (direction % 2 == 0) {
                steps++;
            }
        }
        return ans;
    }
}