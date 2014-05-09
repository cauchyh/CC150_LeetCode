/*
	Write an efficient algorithm that searches for a value in an m x n matrix. 
	This matrix has the following properties:

	Integers in each row are sorted from left to right.
	The first integer of each row is greater than the last integer of the previous row.
	For example,

	Consider the following matrix:

	[
	  [1,   3,  5,  7],
	  [10, 11, 16, 20],
	  [23, 30, 34, 50]
	]
	Given target = 3, return true.
*/

public class SearchMatrix
{
	public static boolean searchMatrix(int[][] matrix, int target)
	{
		int m = matrix.length;
		int n = matrix[0].length;
		int start = 0;
		int last = m*n;
		while (start < last)
		{
			int mid = start + (last - start)/2;
			int element = matrix[mid/n][mid%n]; // funny and good
			if (target == element)
			{
				return true;
			}
			else if (target > element)
			{
				start = mid+1;
			}
			else // target < element
			{
				last = mid; 
			}
		}
		return false;
		// int mid = m*n / 2;
		// return searchMatrix(matrix, target)
	}
}