/*
	Given an array with n objects colored red, white or blue, 
	sort them so that objects of the same color are adjacent,
	with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?
*/

public class SortColor
{
	public static void sortColors(int[] A) 
    {
        // int[] res = 2;
        int start = 0;
        int end = A.length-1;
        int current = 0;
        int temp;
        int oneCont = 0;
        while ((start+oneCont-1 != end))
        {
            //current++;
            // 1 if current data is 0, then start moves 
            if (A[current] == 0)
            {
                A[start] = 0;
                start++;
                current++;
            }
            else if (A[current] == 2)
            {
            	// System.out.println(end);
                temp = A[end];
                A[end] = 2;
                A[current] = temp;
                end--;
                // current++;
            }
            else // the case of 1
            {
                oneCont++;
                current++;
            }

   //          for (int i=0; i<A.length; i++)
			// {
			// 	System.out.print(A[i]);
			// }
			// System.out.println();
        }
        for (int i=0; i<oneCont; i++)
        {
            A[start+i] = 1;
        }
    }
}