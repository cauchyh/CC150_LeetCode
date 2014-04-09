/*
	Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
*/

public class RemoveDupArray2
{
	public static int removeDuplicates(int[] A) 
    {
        if (A.length == 0)
        {
            return 0;
        }
        int data = A[0];
        int current = 1; // current moves once a loop
        int tracer = 1; // trace effective position of the array
        boolean bar = true;
        int num = A.length;
        for (int i=1; i<A.length; i++)
        {
            if (A[current] != data)
            {
            	A[tracer] = A[current];
                tracer++;
                data = A[current];
                bar = true;
            }
            else if (A[current] == data && bar == true)
            {
            	A[tracer] = A[current];
                tracer++;
                bar = false;
                // System.out.println(current);
            }
            else  // if(A[current] == data && bar == false)
            {
            	// System.out.println("meet else");
                num--;
            }
            current++;

        }
        return num;
        
    }
}