/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
*/

public class MergeSArray
{
	public static void merge(int A[], int m, int B[], int n)
	{
		int lastA = m;
		int lastB = n;
		while (lastA != 0 && lastB!= 0)
		{
			if (A[lastA-1] < B[lastB-1])
			{
				A[lastA+lastB-1] = B[lastB-1];
				lastB--;
			}
			else
			{
				A[lastA+lastB-1] = A[lastA-1];
				lastA--;
			}
		}
		if (lastA == 0)
		{
			while (lastB != 0)
			{
				A[lastB-1] = B[lastB-1];
				lastB--;
			}
		}
    }
}

