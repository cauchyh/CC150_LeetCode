/*
	Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/

public class RemoveDupArray
{
	public static int removeDuplicates(int[] A) 
	{
		int curPosition = 1; // move one step
        int tracker = 1; // track the final position
        int curData = A[0];
        int length = A.length;
        for (int i=1; i<A.length; i++)
        {
            curPosition++;
            if (curData == A[i])
            {
                length--;
                // tracker does not move
                
            }
            else
            {
                A[tracker] = A[i];
                curData = A[i];
                tracker++;
            }
            
        }
        return length;
	}
}