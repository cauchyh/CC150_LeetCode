/*
	Implement a function to check if a binary tree is a binary search tree.
*/

import java.util.*;
public class Problem5
{
	// The main solution here is to inorder traversal the tree
	// Here we assume that there is no duplications in the tree
	public static void copyToArray(TreeNode root, ArrayList<Integer> res)
	{
		if (root == null)
		{
			return;
		}
		// int index = 0;
		copyToArray(root.left, res);
		res.add(root.val);
		copyToArray(root.right, res);
	}

	public static boolean isBST(TreeNode root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		copyToArray(root, res);
		for (int i=0; i<res.size()-1; i++)
		{
			if (res.get(i) > res.get(i+1))
			{
				return false;
			}
		}

		return true;
	}
}