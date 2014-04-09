/*
	Implement a function to check if a binary tree is balanced.
	For the purposes of this quesion, a balanced tree is defined to be a 
	tree such that the heights of the two subtree of any node never differ
	by more than one.
*/
import java.util.*;
public class Problem1
{
	public static boolean isBalanced(TreeNode root)
	{
		if (root == null)
		{
			return true;
		}

		if (Math.abs(getDepth(root.left) - getDepth(root.right) > 1))
		{
			return false;
		}

		return isBalanced(root.left)&&isBalanced(root.right);
	}

	private int getDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		return Math.max(getDepth(root.left),getDepth(right))+1;
	}
}
