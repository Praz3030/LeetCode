class Solution {
    public long maxMatrixSum(int[][] matrix) {
       int n = matrix.length;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        boolean negative = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                int temp = Math.abs(num);
                sum += temp;
                if (num < 0) {
                    negative = true;
                }
                min = Math.min(min, temp);
            }
        }

        if (negative) {
            if (countNegative(matrix) % 2 == 1) {
                sum -= 2 * min;
            }
        }

        return sum;
    }

    private int countNegative(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}