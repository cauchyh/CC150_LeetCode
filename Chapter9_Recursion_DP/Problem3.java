/*
	A magic index in an array A[1...n-1] is defined to be an index such that A[i] = 
	i. Given a sorted array of distinct integers, write a method to find a magic index，
	if one exists, in array A.
	FOLLOW UP
	What if the values are not distinct?
*/

public class Problem3
{
	public static int findMagic(int[] array)
	{
		int start = 0;
		int end = array.length-1;
		return findMagic(array, start, end);
	}

	public static int findMagic(int[] array, int start, int end)
	{
		// Sorted array? Binary Search!!
		if (start > end || start <0 || end >= array.length)
		{
			return -1000;
		}

		int mid = (start + end)/2;
		// System.out.println(mid);
		if (array[mid] == mid)
		{
			return array[mid];
		}
		else if (array[mid] > mid) 
		{
			return findMagic(array, start, mid-1);	
		}
		else
		{
			return findMagic(array, mid+1, end);

		}
	}

	
}