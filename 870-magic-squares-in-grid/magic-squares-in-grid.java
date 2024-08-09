class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (row < 3 || col < 3) return 0;

        int ans = 0;

        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                
                if (grid[i][j] + grid[i+1][j] + grid[i+2][j] == sum && 
                    grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] == sum &&
                    grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] == sum &&
                    grid[i][j] + grid[i][j+1] + grid[i][j+2] == sum &&
                    grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2] == sum &&
                    grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] == sum &&
                    grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] == sum &&
                    grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] == sum) {

                    Set<Integer> nums = new HashSet<>();
                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            if (grid[x][y] < 1 || grid[x][y] > 9) {
                                nums.clear();
                                break;
                            }
                            nums.add(grid[x][y]);
                        }
                        if (nums.isEmpty()) break;
                    }
                    
                    if (nums.size() == 9) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}