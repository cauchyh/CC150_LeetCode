/*
	This part of code is used to solve some of the very typical problems of 
	tree data structure. 
	Use both recursion and non-recursion solution
	======================================
	
	1. To calculate the node number of a binary tree:
		getNodeNumRec(), getNodeNum()
	2. Get the depth of a binary tree
		getDepthRec(), getDepth()
	3. PreOrder Traversal, PostOrder Traversal, InOrder Traversal
		The recursion method is very trivial, only give the non-recursion method

*/
import java.util.*;
import java.lang.*;

public class TreeAll
{
	// Problem 1
	// 1. To calculate the node number of a binary tree:
	// getNodeNumRec(), getNodeNum()
	public static int getNodeNumRec(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		else
		{
			int res1 = getNodeNumRec(root.left);
			int res2 = getNodeNumRec(root.right);
			int res = res1 + res2 + 1;
			return res;
		}
	}

	public static int getNodeNum(TreeNode root)
	{
		int count = 1;
		Queue <TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode cur = queue.remove();
			if (cur.left != null)
			{
				queue.add(cur.left);
				count ++;
			}
			if (cur.right != null)
			{
				queue.add(cur.right);
				count ++;
			}
		}
		return count;
	}

	// Problem2
	// 2. Get the depth of a binary tree
	// getDepthRec(), getDepth()
	public static int getDepthRec(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		int dep1 = getDepthRec(root.left);
		int dep2 = getDepthRec(root.right);
		int res = Math.max(dep1, dep2) + 1;
		return res;
	}

	public static int getDepth(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int currentLevelNode = 1;
		int nextLevelNode = 0;
		int depth = 0;
		queue.add(root);
		if (root == null)
		{
			return 0;
		}

		while (!queue.isEmpty())
		{
			currentLevelNode--;
			TreeNode cur = queue.remove();
			if (cur.left != null)
			{
				queue.add(cur.left);
				// currentLevelNode
				nextLevelNode++;
			}

			if (cur.right != null)
			{
				queue.add(cur.right);
				nextLevelNode++;
			}

			if (currentLevelNode == 0)
			{
				depth++;
				currentLevelNode = nextLevelNode;
				nextLevelNode = 0;
			}
		}
		return depth;
	}

	// Problem3
	// PreOrder Traversal, PostOrder Traversal, InOrder Traversal

	public static ArrayList<Integer> preOrderTraversal(TreeNode root)
	{
		
	}

	public static ArrayList<Integer> inorderTraversal(TreeNode root) 
    {
    	
    }

}




















