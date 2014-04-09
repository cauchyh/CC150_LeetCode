/*
	Given a binary tree, design an algorithm which creates a linked list of all
	the nodes at each depth. (e.g. if you hava a tree with depth D, you will hava
	D linked list)
*/

import java.util.*;

public class Problem4
{
	public static ArrayList<LinkedList<TreeNode>> createLevelLList(TreeNode root)
	{
		int currentLevelNode = 1;
		int nextLevelNode = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode cur;
		ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
		queue.add(root);
		while (!queue.isEmpty())
		{
			// cur = queue.remove();
			LinkedList<TreeNode> temp = new LinkedList<TreeNode> ();

			for (int i=0; i<currentLevelNode; i++)
			{
				cur = queue.remove();
				temp.add(cur);
				if (cur.left != null)
				{
					nextLevelNode ++;
					queue.add(cur.left);
				}
				if (cur.right != null)
				{
					nextLevelNode ++;
					queue.add(cur.right);
				}
			}
			res.add(temp);
			currentLevelNode = nextLevelNode;
			nextLevelNode = 0;
		}
		return res;
	}
}
