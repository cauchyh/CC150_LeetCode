/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path 
from the root node down to the farthest leaf node.


*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) 
 * 	   {
 *		  val = x; 
 *	   }
 * }
 */

 public class MaxDepthBTree
 {
 	public static int maxDepth(TreeNode root)
 	{
 		if (root == null)
 		{
 			return 0;
 		}
 		else
 		{
 			int depth1 = maxDepth(root.left);
 			int depth2 = maxDepth(root.right);
 			if (depth1 > depth2)
 			{
 				return depth1 + 1;
 			}
 			else
 			{
 				return depth2 + 1;
 			}
 		}
 	}
 }