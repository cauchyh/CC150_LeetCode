/*
	A child is running up a staircase with n steps, and can hop either 1 step, 
	2 steps or 3 steps at a time. Implement a method to count how many possible 
	ways the child can run up the stairs.
*/

public class Problem1
{
	public static int countStair(int n)
	{
		

		int[] buffer = new int[n];
		return countStair(n, buffer);
	}

	private static int countStair(int n, int[] buffer)
	{
		// some initil value first
		if (n == 1 || n == 0)
		{
			return 1;
		}
		if (n == 2)
		{
			return 2;
		}
		if (n == 3)
		{
			return 4;
		}
		if (buffer[n-1] != 0)
		{
			return buffer[n-1];
		}
		// int total = 0;
		int temp = countStair(n-1, buffer) + countStair(n-2, buffer) + countStair(n-3, buffer);
		buffer[n-1] = temp;
		return temp;


	}
}