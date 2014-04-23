/*
	Given n, how many structurally unique BST's (binary search trees) 
	that store values 1...n?

	For example,
	Given n = 3, there are a total of 5 unique BST's.

	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3
*/

public class UniqueBTree
{
	public static int numTrees(int n) 
    {
        int[] buffer = new int[n];
        return numTrees(n, buffer);
        
    }
    private static int numTrees(int n, int[] buffer)
    {
        int total = 0;
        int temp = 0;
        if (n==1 || n==0)
        {
            return 1;
        }
        if (buffer[n-1] != 0)
        {
            return buffer[n-1];
        }
        for (int i=1; i<=n; i++)
        {
            temp = numTrees(i-1, buffer)*numTrees(n-i, buffer);
            total += temp;
            buffer[n-1] = total;
        }
        return total;
    }
}