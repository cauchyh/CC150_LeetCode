/*

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical 
and the nodes have the same value.
*/


/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class SameTree
{
	public static boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
		{
			return true;
		}
		else if (p == null || q == null)
		{
			return false;
		}

		if (p.val != q.val)
		{
			return false;
		}
		
		boolean leftRes = isSameTree(p.left, q.left);
		boolean rightRes = isSameTree(p.right, q.right);
		return (leftRes && rightRes);
	
	}

}