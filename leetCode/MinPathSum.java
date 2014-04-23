/*
	Given a m x n grid filled with non-negative numbers, 
	find a path from top left to bottom right which minimizes the sum of all numbers along its path.

	Note: You can only move either down or right at any point in time.
*/

public class MinPathSum
{

	public static int minPathSum(int[][] grid) 
    {
        int n = grid[0].length - 1;
        int m = grid.length - 1;
        int[][] minSumBuffer = new int[m+1][n+1]; // store the min. sum for every spot
        // minSumBuffer[1][1] = grid[0][0];
        return minPathSumWBuffer(m, n, minSumBuffer, grid);
    }
    
    private static int minPathSumWBuffer(int m, int n, int[][] minSumBuffer, int[][] grid)
    {
        if (m==0 && n==0)
        {
            return grid[m][n];
        }
        if (minSumBuffer[m][n] != 0) // there is already a value in the buffer
        {
            return minSumBuffer[m][n];
        }
        if (m == 0)
        {
            return minSumBuffer[m][n] = minPathSumWBuffer(m, n-1, minSumBuffer, grid) + grid[m][n];
        }
        if (n == 0)
        {
            return minSumBuffer[m][n] = minPathSumWBuffer(m-1, n, minSumBuffer, grid) + grid[m][n];
        }
        else
        {
            int temp = Math.min(minPathSumWBuffer(m, n-1, minSumBuffer, grid), minPathSumWBuffer(m-1, n, minSumBuffer, grid)) + grid[m][n];
            minSumBuffer[m][n] = temp;
            return temp;
        }
    }
}