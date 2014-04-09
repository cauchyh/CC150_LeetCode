/*
	Design an algorithm and write code to find the first common ancestor of two nodes
	in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This 
	is not necessarily a binary search tree.
*/

public class Problem7
{
	public static TreeNode firstCommonAncestor (TreeNode root, TreeNode r1, TreeNode r2)
	{
		if (root == null) 
		{
			return null;
		}
		if (root == r1 || root == r2)
		{
			return root;
		}
		// TreeNode cur = root;
		if (covers(root.left, r1) && covers(root.left, r2))
		{
			return firstCommonAncestor(root.left, r1, r2);
		}
		else if (covers(root.right, r1) && covers(root.right, r2))
		{
			return firstCommonAncestor(root.right, r1, r2);
		}
		else
		{
			return root;
		}
	}

	public static boolean covers(TreeNode root, TreeNode r)
	{
		if (root == null)
		{
			return false;
		}
		if (root == r)
		{
			return true;
		}
		return covers(root.left, r) || covers(root.right, r);
	}
}