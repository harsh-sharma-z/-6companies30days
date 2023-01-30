class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int currSum = 
                    grid[i][j] + grid[i][j + 1] + grid[i][j + 2] +            
                    grid[i + 1][j + 1] +                                            
                    grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];       
                maxSum = Math.max(currSum, maxSum);
            }
        }
        
        return maxSum;
    }
}
