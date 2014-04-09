/*
	Given a sorted (increasing order) array with unique integer elements, write analgorithm
	to create a binary search tree with minimum height.
*/

public class Problem3
{
	public static TreeNode sortedArrayToBST(int[] num) 
    {
        if (num.length == 0)
        {
            return null;
        }
        if (num.length == 1)
        {
            return new TreeNode(num[0]);
        }
        if (num.length == 2)
        {
            TreeNode res = new TreeNode(num[1]);
            res.left = new TreeNode(num[0]);
            return res;
        }
        return sortedArrayToBST(num, 0, num.length-1);
    }
    
    public static TreeNode sortedArrayToBST(int[] num, int start, int end)
    {
        if (end < start)
        {
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid-1);
        root.right = sortedArrayToBST(num, mid+1, end);
        return root;
    }
}